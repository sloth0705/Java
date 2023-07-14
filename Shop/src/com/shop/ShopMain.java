package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

/*
 * 날짜 : 2023/07/13
 * 이름 : 신진성 
 * 내용 : Shop CRUD 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("---------------------");

		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO = ProductDAO.getInstance();

		// 로그인 사용자 객체
		CustomerVO loginedCustomer = null;

		while (true) {
			if (loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			} else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");
			}
			System.out.print("선택 : ");
			int answer = sc.nextInt();
			if (answer == 0) {
				// 종료
				break;
			} else if (answer == 1) {
				if (loginedCustomer == null) {
					// 로그인
					System.out.print("아이디 입력 : ");
					loginedCustomer = customerDAO.selectCustomer(sc.next());
					if (loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					} else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				} else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;
				}
			} else if (answer == 2) {
				if (loginedCustomer == null) {
					// 회원가입
					CustomerVO vo = new CustomerVO();
					System.out.print("아이디 입력 : ");
					vo.setCustId(sc.next());
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
					System.out.print("휴대폰 입력 : ");
					vo.setHp(sc.next());
					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());
					int result = customerDAO.insertCustomer(vo);
					if (result > 0) {
						System.out.println("회원가입을 축하합니다.");
					} else {
						System.out.println("회원가입에 실패했습니다. 다시 회원가입 하십시오.");
					}
				} else {
					// 주문현황
					List<OrderVO> myOrders =  orderDAO.selectOrders(loginedCustomer.getCustId());
					
					for (OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
				}
			} else if (answer == 3) {
				// 상품목록
				List<ProductVO> products = productDAO.selectProducts();
				System.out.println("-----------상품목록-----------");
				for (ProductVO product : products) {
					System.out.println(product);
				}
				System.out.println("----------------------------");
			} else if (answer == 4) {
				// 주문하기
				if (loginedCustomer == null) {
					System.out.println("로그인을 먼저 하십시오.");
					continue;
				}
				OrderVO orderVO = new OrderVO();

				System.out.println("주문 상품번호 입력 : ");
				orderVO.setOrderProduct(sc.nextInt());
				System.out.println("주문 수량 입력 : ");
				orderVO.setOrderCount(sc.nextInt());

				// 주문자 아이디
				orderVO.setOrderId(loginedCustomer.getCustId());
				
				// 주문 처리
				int result = orderDAO.insertOrder(orderVO);
				
				// 상품 재고 수정
				productDAO.updateProductStock(orderVO.getOrderProduct(), orderVO.getOrderCount());
				
				if (result > 0) {
					System.out.println("상품 주문이 완료 되었습니다.");
				} else {
					System.out.println("상품 주문이 실패 했습니다.");
				}

			}
		}
		sc.close();
		System.out.println("안녕히 가세요~");
	}
}
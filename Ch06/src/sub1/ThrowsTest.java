package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 신진성 
 * 내용 : Java 예외 던지기 실습하기 
 */
public class ThrowsTest {
	public static void main(String[] args) {
		try {
			myMethod1(10);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 정상 종료...");
		}
	}

	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
	}

	public static void myMethod2(int n1) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("n2 입력 : ");
		int n2 = sc.nextInt();
		int result = n1 / n2;
		System.out.println("result : " + result);
		sc.close();
	}
}
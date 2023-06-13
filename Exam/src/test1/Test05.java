package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 신진성 
 * 내용 : 자바 조건문 연습문제
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x값 입력 : ");
		int x = sc.nextInt();

		System.out.print("y값 입력 : ");
		int y = sc.nextInt();

		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";

		System.out.println(result);
		sc.close();
	}
}

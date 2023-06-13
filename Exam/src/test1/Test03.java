package test1;

/*
 * 날짜 : 2023/06/13
 * 이름 : 신진성 
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		int num = 1;
		int result;

		result = num++;
		System.out.println("result : " + result);

		result = ++num;
		System.out.println("result : " + result);

		result = num--;
		System.out.println("result : " + result);

		result = --num;
		System.out.println("result : " + result);
	}
}

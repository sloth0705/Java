package test5;

/*
 * 날짜 : 2023/07/17
 * 이름 : 신진성 
 * 내용 : 자바 총정리 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		for (int y = 1; y <= 9; y++) {
			for (int x = 2; x <= 9; x++) {
				System.out.printf("%d x %d = %2d    ", x, y, y * x);
			}
			System.out.print("\n");
		}
	}
}
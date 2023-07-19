package confirm.ch05;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = null;
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				System.out.print("학생수>");
				int cnt = Integer.parseInt(sc.nextLine());
				arr = new int[cnt];
			} else if (select == 2) {
				for (int i = 0; i < arr.length; i++) {
					System.out.printf("scores[%d]", i);
					arr[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (select == 3) {
				for (int i = 0; i < arr.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, arr[i]);
				}
			} else if (select == 4) {
				int sum = 0;
				int max = 0;
				for (int score : arr) {
					sum += score;
					if (score > max) {
						max = score;
					}
				}
				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("평균 점수: %.1f\n", ((double) sum / arr.length));
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
package step7;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		int cnt = sc.nextInt();
		int area = 0;

		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int j = a; j < a + 10; j++) {
				for (int h = b; h < b + 10; h++) {
					arr[j][h] = 1;
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1) {
					area++;
				}
			}
		}

		System.out.println(area);
		sc.close();
	}
}
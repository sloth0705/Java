package step8;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] arr = new int[cnt][4];
		int[] arr2 = { 25, 10, 5, 1 };

		for (int i = 0; i < cnt; i++) {
			int money = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				arr[i][j] = money / arr2[j];
				money = money % arr2[j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int n : arr[i]) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
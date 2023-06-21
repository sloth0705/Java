package step7;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int top = 0;
		int x = 1;
		int y = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > top) {
					top = arr[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		System.out.println(top);
		System.out.println(x + " " + y);
		sc.close();
	}
}
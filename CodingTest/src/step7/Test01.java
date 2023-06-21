package step7;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();

		int[][] arr1 = new int[size1][size2];
		int[][] arr2 = new int[size1][size2];

		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				System.out.print((arr1[i][j] + arr2[i][j]) + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
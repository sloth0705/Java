package step4;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();

			for (int j = 0; j < ((d - c) / 2 + 1); j++) {
				int temp = 0;
				temp = arr[d - 1 - j];
				arr[d - 1 - j] = arr[c - 1 + j];
				arr[c - 1 + j] = temp;
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

		sc.close();
	}
}

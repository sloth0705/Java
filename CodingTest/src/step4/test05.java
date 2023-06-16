package step4;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();

			for (int j = c; j <= d; j++) {
				arr[j - 1] = e;
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

		sc.close();
	}
}

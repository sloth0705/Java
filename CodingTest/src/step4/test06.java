package step4;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < b; i++) {
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			int temp = 0;

			temp = arr[c];
			arr[c] = arr[d];
			arr[d] = temp;
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

		sc.close();
	}
}

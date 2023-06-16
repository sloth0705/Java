package step4;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] arr = new int[count];
		int num = sc.nextInt();

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		for (int n : arr) {
			if (n < num) {
				System.out.print(n + " ");
			}
		}

		sc.close();
	}
}

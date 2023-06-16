package step4;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		int top = arr[0];
		int bottom = arr[0];

		for (int n : arr) {
			if (n > top) {
				top = n;
			}
			if (n < bottom) {
				bottom = n;
			}
		}

		System.out.println(bottom + " " + top);

		sc.close();
	}
}

package step4;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int top = arr[0];
		int loc = 1;

		for (int i = 0; i < 9; i++) {
			if (top < arr[i]) {
				top = arr[i];
				loc = i + 1;
			}
		}

		System.out.println(top);
		System.out.println(loc);

		sc.close();
	}
}

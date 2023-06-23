package step10;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int x = 0;
		int y = 0;

		for (int i = 0; i < 3; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			x ^= arr1[i];
			y ^= arr2[i];
		}

		System.out.println(x + " " + y);
		sc.close();
	}
}
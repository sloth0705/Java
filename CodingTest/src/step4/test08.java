package step4;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		int count = 10;
		for (int i = 0; i < 42; i++) {
			int count2 = 0;
			for (int j = 0; j < 10; j++) {
				if (arr[j] == i) {
					count2++;
				}
			}
			if (count2 > 1) {
				count -= count2 - 1;
			}
			count2 = 0;
		}

		System.out.println(count);

		sc.close();
	}
}

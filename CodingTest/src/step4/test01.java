package step4;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] arr = new int[count];
		int sum = 0;
		int num;

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		num = sc.nextInt();

		for (int n : arr) {
			if (n == num) {
				sum++;
			}
		}

		System.out.println(sum);

		sc.close();
	}
}

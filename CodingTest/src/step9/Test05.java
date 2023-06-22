package step9;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;
		int min = 0;

		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				sum += i;
				if (min == 0) {
					min = i;
				}
			}
		}

		if (sum > 0) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}

		sc.close();
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
package step3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int count = sc.nextInt();
		int money = 0;
		int a = 0;
		int b = 0;

		for (int i = 1; i <= count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			money += a * b;
		}

		if (total == money) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}

package step2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int money = 0;

		if (a == b && a == c) {
			money = 10000 + (1000 * a);
		} else if (a == b || a == c) {
			money = 1000 + (100 * a);
		} else if (b == c) {
			money = 1000 + (100 * b);
		} else {
			int top = a;
			if (top < b) {
				top = b;
			}
			if (top < c) {
				top = c;
			}
			money = 100 * top;
		}

		System.out.println(money);

		sc.close();
	}
}

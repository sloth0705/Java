package step10;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int top = 0;
		int other = 0;

		if (a >= b && a >= c) {
			top = a;
			other = b + c;
		} else if (b >= a && b >= c) {
			top = b;
			other = a + c;
		} else if (c >= a && c >= b) {
			top = c;
			other = a + b;
		}

		while (true) {
			if (top >= other) {
				top--;
			} else {
				break;
			}
		}

		System.out.println(top + other);
		sc.close();
	}
}
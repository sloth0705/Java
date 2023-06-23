package step10;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if ((a + b + c) == 0) {
				break;
			}

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

			if (top >= other) {
				System.out.println("Invalid");
			} else if (a == b && a == c) {
				System.out.println("Equilateral");
			} else if (a == b || a == c || b == c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
		sc.close();
	}
}
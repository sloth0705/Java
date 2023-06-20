package step5;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = ((a % 10) * 100) + (((a / 10) % 10) * 10) + (a / 100);
		int d = ((b % 10) * 100) + (((b / 10) % 10) * 10) + (b / 100);

		int num = 0;

		if (c > d) {
			num = c;
		} else {
			num = d;
		}

		System.out.println(num);
		sc.close();
	}
}
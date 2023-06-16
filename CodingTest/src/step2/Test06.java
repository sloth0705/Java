package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int hour = 0;
		int minute = 0;

		if ((b + c) / 60 > 0) {
			a += (b + c) / 60;

			if (a > 23) {
				hour = a - 24;
			} else {
				hour = a;
			}
			minute = (b + c) % 60;
		} else {
			hour = a;
			minute = (b + c) % 60;
		}

		System.out.println(hour + " " + minute);

		sc.close();
	}
}

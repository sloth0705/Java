package step2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		int alarm1 = 0;
		int alarm2 = 0;

		if (m >= 45) {
			alarm1 = h;
			alarm2 = m - 45;
		} else {
			h--;
			alarm2 = 60 - (45 - m);

			if (h < 0) {
				alarm1 = 23;
			} else {
				alarm1 = h;
			}
		}

		System.out.println(alarm1 + " " + alarm2);

		sc.close();
	}
}

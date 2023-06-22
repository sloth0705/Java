package step9;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int count = 0;

		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();

			if (a == 2) {
				count++;
			} else if (a % 2 != 0 && a > 2) {
				int b = 1;
				for (int j = 3; j <= a; j++) {
					if (a % j == 0) {
						b = (b * j);
						if (b > a) {
							j = a + 1;
						}
					}
				}
				if (b == a) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
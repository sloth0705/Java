package Bronze;

import java.util.Scanner;

public class Test1145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int f = 1;
		while (true) {
			int cnt = 0;
			int g = 0;

			if (f % a == 0) {
				cnt++;
			} else {
				g = a - (f % a);
			}
			if (f % b == 0) {
				cnt++;
			} else {
				if (g > b - (f % b) || g == 0) {
					g = b - (f % b);
				}
			}
			if (f % c == 0) {
				cnt++;
			} else {
				if (g > c - (f % c) || g == 0) {
					g = c - (f % c);
				}
			}
			if (f % d == 0) {
				cnt++;
			} else {
				if (g > d - (f % d) || g == 0) {
					g = d - (f % d);
				}
			}
			if (f % e == 0) {
				cnt++;
			} else {
				if (g > e - (f % e) || g == 0) {
					g = e - (f % e);
				}
			}

			if (cnt >= 3) {
				break;
			} else {
				f += g;
			}
		}
		System.out.println(f);
		sc.close();
	}
}
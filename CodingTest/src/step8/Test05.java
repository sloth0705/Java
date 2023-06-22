package step8;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() - 1;
		int cnt = 0;

		while (true) {
			int b = 6 * cnt;
			cnt++;
			if (a > b) {
				a -= b;
			} else {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
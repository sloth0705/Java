package step8;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int day = 1;

		v -= a;

		if (v % (a - b) == 0) {
			day += v / (a - b);
		} else {
			day += (v / (a - b) + 1);
		}

		System.out.println(day);
		sc.close();
	}
}
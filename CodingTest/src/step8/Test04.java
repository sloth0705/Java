package step8;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int a = 2;

		for (int i = 0; i < cnt; i++) {
			a = a + (a - 1);
		}
		System.out.println(a * a);
		sc.close();
	}
}
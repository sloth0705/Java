package step10;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int exit = x;

		if (w - x < exit) {
			exit = w - x;
		}
		if (y < exit) {
			exit = y;
		}
		if (h - y < exit) {
			exit = h - y;
		}

		System.out.println(exit);
		sc.close();
	}
}
package step10;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arrX = { 10001, -10001 };
		int[] arrY = { 10001, -10001 };

		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (arrX[0] > x) {
				arrX[0] = x;
			}
			if (arrX[1] < x) {
				arrX[1] = x;
			}

			if (arrY[0] > y) {
				arrY[0] = y;
			}
			if (arrY[1] < y) {
				arrY[1] = y;
			}
		}
		System.out.println((arrX[1] - arrX[0]) * (arrY[1] - arrY[0]));
		sc.close();
	}
}
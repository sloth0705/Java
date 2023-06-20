package step6;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] white = new int[6];
		int[] black = { 1, 1, 2, 2, 2, 8 };
		int[] num = new int[6];
		for (int i = 0; i < white.length; i++) {
			white[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			num[i] = black[i] - white[i];
			System.out.print(num[i] + " ");
		}

		sc.close();
	}
}
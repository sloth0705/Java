package step6;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= (num * 2) - 1; i++) {
			if (i < num) {
				for (int j = 0; j < num - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2) - 1; j++) {
					System.out.print("*");
				}
			} else if (i == num) {
				for (int j = 0; j < (i * 2) - 1; j++) {
					System.out.print("*");
				}
			} else if (i >= num) {
				for (int j = 0; j < i - num; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < ((num * 2) - (i + 1)) * 2 + 1; j++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
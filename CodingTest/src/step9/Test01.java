package step9;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == b && a == 0) {
				break;
			}

			if (b % a == 0) {
				System.out.println("factor");
			} else if (a % b == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		sc.close();
	}
}
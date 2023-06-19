package step5;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct = sc.nextInt();

		for (int i = 0; i < ct; i++) {
			String str = sc.next();
			if (str.length() < 2) {
				System.out.print(str.charAt(0));
				System.out.print(str.charAt(0));
			} else {
				System.out.print(str.charAt(0));
				System.out.print(str.charAt(str.length() - 1));
			}
			System.out.print("\n");
		}

		sc.close();
	}
}

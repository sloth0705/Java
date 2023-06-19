package step5;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ct = sc.nextInt();

		System.out.println(str.substring(ct - 1, ct));

		sc.close();
	}
}
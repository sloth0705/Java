package step5;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct = sc.nextInt();
		String str = sc.next();

		int sum = 0;
		for (int i = 0; i < ct; i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println(sum);
		sc.close();
	}
}
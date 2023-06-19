package step5;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 97; i <= 122; i++) {
			char a = (char) i;
			System.out.print(str.indexOf(a) + " ");
		}
		sc.close();
	}
}
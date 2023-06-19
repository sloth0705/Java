package step5;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = str.charAt(0);
		System.out.println((int) c);
		sc.close();
	}
}
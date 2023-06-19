package step5;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct = sc.nextInt();
		for (int i = 0; i < ct; i++) {
			int count = sc.nextInt();
			String str = sc.next();
			String st = "";
			for (int j = 0; j < str.length(); j++) {
				for (int h = 0; h < count; h++) {
					st += str.charAt(j);
				}
			}
			System.out.println(st);
		}
		sc.close();
	}
}
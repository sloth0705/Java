package step5;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	}
}
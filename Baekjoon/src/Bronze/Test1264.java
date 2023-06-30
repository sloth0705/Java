package Bronze;

import java.util.Scanner;

public class Test1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
		while (true) {
			String testCase = sc.nextLine();
			if (testCase.equals("#")) {
				break;
			}
			int oldLength = testCase.length();
			for (int i = 0; i < arr.length; i++) {
				testCase = testCase.replace(arr[i], "");
			}
			int newLength = testCase.length();

			System.out.println(oldLength - newLength);
		}
		sc.close();
	}
}
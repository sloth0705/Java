package Bronze;

import java.util.Scanner;

public class Test1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String testCase = sc.next();
			if (testCase.equals("0")) {
				break;
			}
			char[] arr = testCase.toCharArray();
			int cnt = 0;
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[(arr.length - 1) - i]) {
					cnt++;
				}
			}
			if (cnt > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
		sc.close();
	}
}
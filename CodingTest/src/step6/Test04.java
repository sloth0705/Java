package step6;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a = str.length();
		char[] arr = new char[a];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < (a / 2); i++) {
			if (arr[i] != arr[(a - 1) - i]) {
				cnt++;
			}
		}
		if (cnt > 0) {
			cnt = 0;
		} else {
			cnt = 1;
		}
		System.out.println(cnt);
		sc.close();
	}
}
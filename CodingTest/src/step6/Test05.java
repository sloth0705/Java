package step6;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] arr = new int[26];
		int top = 0;
		int num = 0;
		int cnt = 0;
		char c = '?';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if ((i + 65) == (int) str.charAt(j)) {
					arr[i]++;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > top) {
				top = arr[i];
				num = i;
				cnt = 0;
			} else if (arr[i] == top) {
				cnt++;
			}
		}

		if (cnt == 0) {
			c = (char) (num + 65);
		}
		System.out.println(c);
		sc.close();
	}
}
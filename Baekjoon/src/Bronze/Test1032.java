package Bronze;

import java.util.Scanner;

public class Test1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] arr = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.next();
		}
		String msg = arr[0];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < msg.length(); j++) {
				char a = msg.charAt(j);
				char b = arr[i].charAt(j);
				if (a != b) {
					msg = msg.substring(0, j) + "?" + msg.substring(j + 1);
				}
			}
		}
		System.out.println(msg);
		sc.close();
	}
}
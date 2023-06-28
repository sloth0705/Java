package Bronze;

import java.util.Scanner;

public class Test1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				char a = str.charAt(j);
				int b = i % 2;
				int c = j % 2;
				if (b == 0 && c == 0 && a == 'F') {
					cnt++;
				} else if (b != 0 && c != 0 && a == 'F') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
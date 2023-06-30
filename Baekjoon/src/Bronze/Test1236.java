package Bronze;

import java.util.Scanner;

public class Test1236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] arrX = new char[m];
		char[] arrY = new char[n];
		int answer = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int cnt = 0;
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'X') {
					arrX[j] = 'X';
					cnt++;
				} else if (arrX[j] != 'X') {
					arrX[j] = '.';
				}
			}
			if (cnt > 0) {
				arrY[i] = 'X';
			} else {
				arrY[i] = '.';
			}
		}
		for (char x2 : arrX) {
			if (x2 == '.') {
				x++;
			}
		}
		for (char y2 : arrY) {
			if (y2 == '.') {
				y++;
			}
		}
		if (x > y) {
			answer = x;
		} else {
			answer = y;
		}

		System.out.println(answer);
		sc.close();
	}
}
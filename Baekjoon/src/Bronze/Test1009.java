package Bronze;

import java.util.Scanner;

public class Test1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 1;
			for (int j = 1; j <= b; j++) {
				c = (c * a) % 10;
			}
			if (c == 0) {
				c = 10;
			}
			System.out.println(c);
		}
		sc.close();
	}
}
package step6;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int num = 0;
		for (int i = 0; i < cnt; i++) {
			String str = sc.next();
			int a = str.length();
			for (int j = 0; j < a; j++) {
				String str2 = str.substring(j, j + 1);
				String str6 = str.substring(j);
				String str3 = str6.replaceAll(str2, "");
				int c = str6.length();
				int b = str3.length();
				int d = c - b;
				if (d > 1) {
					String str4 = str.substring(j, j + d);
					String str5 = str4.replaceAll(str2, "");
					if (!str5.equals("")) {
						num++;
						j = a;
					}
				}
			}
		}
		System.out.println(cnt - num);
		sc.close();
	}
}
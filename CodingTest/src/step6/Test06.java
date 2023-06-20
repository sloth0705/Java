package step6;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (str.substring(i).startsWith(arr[j])) {
					cnt++;
					String st = "";
					for (int h = 0; h < arr[j].length(); h++) {
						st += " ";
					}
					str = str.substring(0, i) + st + str.substring(i + arr[j].length());
				}
			}
		}
		cnt += str.replaceAll(" ", "").length();
		System.out.println(cnt);
		sc.close();
	}
}
package step8;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		int cnt = 1;

		String str = "";

		while (true) {
			c = c / b;
			if (c > 0) {
				cnt++;
			} else {
				break;
			}
		}

		int[] arr = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = (int) Math.pow(b, i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int d = a;
			int e = d / arr[i];
			a = a % arr[i];
			char var = ' ';
			if (e > 9) {
				e += 55;
				var = (char) e;
				str += var + "";
			} else {
				str += e + "";
			}
		}

		System.out.println(str);
		sc.close();
	}
}
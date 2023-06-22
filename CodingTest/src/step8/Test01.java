package step8;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		int[] arr = new int[str.length()];
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			int a = (int) str.charAt(i);
			if (a >= 65) {
				a -= 55;
			} else if (a >= 48) {
				a -= 48;
			}
			arr[i] = a;
		}

		for (int i = 0; i < arr.length; i++) {
			int rs = (int) Math.pow(num, i);
			sum += arr[arr.length - (i + 1)] * rs;
		}

		System.out.println(sum);
		sc.close();
	}
}
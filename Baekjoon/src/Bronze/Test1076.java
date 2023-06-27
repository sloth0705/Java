package Bronze;

import java.util.Scanner;

public class Test1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int a1 = 0;
		int b1 = 0;
		String c1 = "";
		String[] arr = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		for (int i = 0; i < arr.length; i++) {
			if (a.equals(arr[i])) {
				a1 = i * 10;
			}
			if (b.equals(arr[i])) {
				b1 = i;
			}
			if (c.equals(arr[i])) {
				for (int j = 1; j <= i; j++) {
					c1 += "0";
				}
			}
		}
		if (a1 + b1 == 0) {
			c1 = "";
		}
		System.out.println((a1 + b1) + c1);
		sc.close();
	}
}
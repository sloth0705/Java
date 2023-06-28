package Bronze;

import java.util.Scanner;

public class Test1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		long sum = 0;

		if (a.equals(0) || b.equals(0)) {
			System.out.println(0);
			sc.close();
			return;
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				sum += ((arr1[i] - '0') * (arr2[j] - '0'));
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
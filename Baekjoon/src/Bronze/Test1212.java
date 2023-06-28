package Bronze;

import java.util.Scanner;

public class Test1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] arr = { "000", "001", "010", "011", "100", "101", "110", "111" };
		StringBuilder str = new StringBuilder();

		if (a.equals("0")) {
			System.out.println("0");
			sc.close();
			return;
		}

		for (int i = 0; i < a.length(); i++) {
			int b = Character.getNumericValue(a.charAt(i));
			str.append(arr[b]);
		}
		String str2 = str.toString();
		while (str2.charAt(0) == '0') {
			str2 = str2.substring(1);
		}
		System.out.println(str2);
		sc.close();
	}
}
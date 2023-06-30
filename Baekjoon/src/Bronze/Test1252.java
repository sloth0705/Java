package Bronze;

import java.util.Scanner;

public class Test1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		StringBuilder str = new StringBuilder();
		int i = str1.length() - 1;
		int j = str2.length() - 1;
		int a = 0;
		while (i >= 0 || j >= 0 || a > 0) {
			int num1 = i >= 0 ? str1.charAt(i) - '0' : 0;
			int num2 = j >= 0 ? str2.charAt(j) - '0' : 0;
			int sum = num1 + num2 + a;

			str.insert(0, sum % 2);
			a = sum / 2;
			i--;
			j--;
		}
		while (str.charAt(0) == '0' && str.length() > 1) {
			str.deleteCharAt(0);
		}
		System.out.println(str);
		sc.close();
	}
}
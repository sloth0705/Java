package step9;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 2; i <= a; i++) {
			while (a % i == 0) {
				System.out.println(i);
				a = (a / i);
			}
		}
		sc.close();
	}
}
package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}
}
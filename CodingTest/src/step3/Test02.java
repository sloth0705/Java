package step3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int z = sc.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 0; i < z; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}

		sc.close();
	}
}

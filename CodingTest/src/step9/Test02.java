package step9;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int num = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				cnt++;
			}
			if (cnt == b) {
				num = i;
				i = a + 1;
			}
		}
		System.out.println(num);
		sc.close();
	}
}
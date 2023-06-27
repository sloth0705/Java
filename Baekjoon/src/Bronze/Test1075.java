package Bronze;

import java.util.Scanner;

public class Test1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (sc.nextInt() / 100) * 100;
		int f = sc.nextInt();
		int a = n % f;
		int b = ((n + (f - a)) % 100) % f;
		System.out.printf("%02d", b);
		sc.close();
	}
}
package Bronze;

import java.util.Scanner;

public class Test1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNo = sc.nextInt();
		int cycle = 1;
		int a = firstNo;
		while (true) {
			int b = a % 10;
			if (a < 10) {
				b = a;
			}
			int c = ((a / 10) + (a % 10)) % 10;
			a = (b * 10) + c;
			if (firstNo == a) {
				break;
			} else {
				cycle++;
			}
		}
		System.out.println(cycle);
		sc.close();
	}
}
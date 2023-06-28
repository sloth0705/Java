package Bronze;

import java.util.Scanner;

public class Test1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int time = 0;
		int i = 0;
		int b2 = b; // 맥박
		while (i < a) {
			if (b + d > c) {
				time = -1;
				break;
			}
			if (b2 + d <= c) { // 운동
				b2 += d;
				i++;
			} else { // 휴식
				if (b2 - e > b) {
					b2 -= e;
				} else {
					b2 = b;
				}
			}
			time++;
		}
		System.out.println(time);
		sc.close();
	}
}
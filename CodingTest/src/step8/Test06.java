package step8;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		while (true) {
			if (num <= cnt) {
				break;
			}
			num -= cnt;
			cnt++;
		}
		if (cnt % 2 == 0) {
			System.out.println(num + "/" + (cnt - (num - 1)));
		} else {
			System.out.println((cnt - (num - 1)) + "/" + num);
		}
		sc.close();
	}
}
package Bronze;

import java.util.Scanner;

public class Test1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int m = 0;
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int telTime = sc.nextInt() + 1;
			y += calY(telTime);
			m += calM(telTime);
		}
		if (y == m) {
			System.out.println("Y M " + y);
		} else if (y < m) {
			System.out.println("Y " + y);
		} else if (y > m) {
			System.out.println("M " + m);
		}

		sc.close();
	}

	public static int calY(int tel) {
		int money;
		int cnt = tel % 30 != 0 ? 1 : 0;
		money = ((tel / 30) * 10) + (cnt * 10);

		return money;
	}

	public static int calM(int tel) {
		int money;
		int cnt = tel % 60 != 0 ? 1 : 0;
		money = ((tel / 60) * 15) + (cnt * 15);

		return money;
	}
}
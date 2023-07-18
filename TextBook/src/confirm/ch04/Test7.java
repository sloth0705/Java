package confirm.ch04;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			int choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				System.out.print("예금액>");
				money += Integer.parseInt(sc.nextLine());
			} else if (choice == 2) {
				System.out.print("출금액>");
				money -= Integer.parseInt(sc.nextLine());
			} else if (choice == 3) {
				System.out.print("잔고>");
				System.out.println(money);
			} else {
				System.out.print("프로그램 종료");
				break;
			}
		}
		
		sc.close();
	}
}
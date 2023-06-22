package step9;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			if (a == -1) {
				break;
			}
			
			int b = 0;
			String str = "= ";
			for (int i = 1; i <= (a/2); i++) {
				if (a % i == 0) {
					b += i;
					str += i + " ";
					if (i != (a/2)) {
						str += "+ ";
					}
				}
			}
			if (a == b) {
				
			} else {
				str = "is NOT perfect.";
			}
			System.out.println(a + " " + str);
		}
		sc.close();
	}
}
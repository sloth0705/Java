package sub1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. H : 시 | m : 분 | x : 걸리는 시간
		// 2. (m + x) > 60 -> H += (x / 60); , m = x - ((x / 60)60);
		// 3. m == 60 -> H+1, m=0;
		// 4. H == 24 -> H = 0;

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

//        System.out.printf("%s %s\n%s\n", H,m,x);

		m = m + x;
		if (m >= 60) {
			H += (m / 60);
			m = m - ((m / 60)) * 60;
			if (m == 60)
				m = 0;
			if (H >= 24)
				H -= 24;
			System.out.printf("%s %s", H, m);
		} else {
			if (H >= 24)
				H -= 24;
			System.out.printf("%s %s", H, m);
		}
		sc.close();
	}
}
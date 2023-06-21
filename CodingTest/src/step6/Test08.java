package step6;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr1 = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
		float[] arr2 = { 4.5f, 4.0f, 3.5f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f, 0.0f };

		int cnt = 0;
		float score = 0;
		float total = 0;

		for (int i = 0; i < 20; i++) {
			String str1 = sc.next();
			double a = sc.nextDouble();
			String str2 = sc.next();
			if (!str2.equals("P")) {
				for (int j = 0; j < 9; j++) {
					if (str2.equals(arr1[j])) {
						score += a;
						total += a * arr2[j];
					}
				}
			}
		}

		System.out.println(total / score);

		sc.close();
	}
}
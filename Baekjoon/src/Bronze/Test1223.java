package Bronze;

import java.util.Scanner;

public class Test1223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int[] arr = new int[80];
		int top = 0;
		int num = 0;

		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					int sum = i + j + k;
					arr[sum - 1]++;
					if (arr[sum - 1] > top) {
						top = arr[sum - 1];
						num = sum;
					}
				}
			}
		}
		System.out.println(num);
		sc.close();
	}
}
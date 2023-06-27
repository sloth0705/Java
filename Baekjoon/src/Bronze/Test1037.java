package Bronze;

import java.util.Scanner;

public class Test1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		int a = 0;
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		if (arr.length % 2 == 0) {
			a = arr[0] * arr[cnt - 1];
		} else {
			a = arr[cnt / 2] * arr[cnt / 2];
		}
		System.out.println(a);
		sc.close();
	}
}
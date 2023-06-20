package step5;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = new char[str.length()];
		int[] arr2 = new int[arr.length];
		int time = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (65 <= arr[i] && arr[i] <= 67) {
				arr2[i] = 2;
			} else if (68 <= arr[i] && arr[i] <= 70) {
				arr2[i] = 3;
			} else if (71 <= arr[i] && arr[i] <= 73) {
				arr2[i] = 4;
			} else if (74 <= arr[i] && arr[i] <= 76) {
				arr2[i] = 5;
			} else if (77 <= arr[i] && arr[i] <= 79) {
				arr2[i] = 6;
			} else if (80 <= arr[i] && arr[i] <= 83) {
				arr2[i] = 7;
			} else if (84 <= arr[i] && arr[i] <= 86) {
				arr2[i] = 8;
			} else if (87 <= arr[i] && arr[i] <= 90) {
				arr2[i] = 9;
			}
		}

		for (int n : arr2) {
			time += (n + 1);
		}

		System.out.println(time);
		sc.close();
	}
}
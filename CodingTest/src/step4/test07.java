package step4;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i + 1) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int[] arr2 = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				if (arr2[0] == 0) {
					arr2[0] = i + 1;
				} else {
					arr2[1] = i + 1;
				}
			}
		}

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		sc.close();
	}
}
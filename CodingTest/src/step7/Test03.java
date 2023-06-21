package step7;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][];
		int top = 0;
		for (int i = 0; i < 5; i++) {
			String str = sc.nextLine().replaceAll(" ", "");
			int a = str.length();
			arr[i] = new char[a];
			if (a > top) {
				top = a;
			}
			for (int j = 0; j < a; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < top; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j].length > i) {
					System.out.print(arr[j][i]);
				}
			}
		}
		sc.close();
	}
}
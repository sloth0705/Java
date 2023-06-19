package step5;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		String[] arr = str.split("\\s+");
		int count = 0;
		if (!arr[0].equals("")) {
			count = arr.length;
		}
		System.out.println(count);
		sc.close();
	}
}
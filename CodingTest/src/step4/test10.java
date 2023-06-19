package step4;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ct = sc.nextInt();
		double[] arr = new double[ct];
		double top = 0;

		for (int i = 0; i < ct; i++) {
			double a = sc.nextDouble();
			arr[i] = a;
		}

		for (double n : arr) {
			if (n > top) {
				top = n;
			}
		}

		double sum = 0;
		for (double n : arr) {
			n = n / top * 100;
			sum += n;
		}

		System.out.println(sum / ct);
		sc.close();
	}
}

package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1223 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int s1 = bf.read();
		int s2 = bf.read();
		int s3 = bf.read();
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
	}
}
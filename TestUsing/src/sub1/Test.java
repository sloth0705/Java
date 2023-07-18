package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			long A = Long.parseLong(str[0]);
			long B = Long.parseLong(str[1]);
			long C = Long.parseLong(str[2]);
			long sum = A + B + C;

			System.out.print(sum);
		} catch (IOException e) {
			e.getMessage();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
}
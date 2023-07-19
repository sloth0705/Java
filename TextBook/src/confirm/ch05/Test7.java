package confirm.ch05;

public class Test7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		for (int a : array) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println(max);
	}
}
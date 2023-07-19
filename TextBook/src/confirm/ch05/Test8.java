package confirm.ch05;

public class Test8 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int a : array[i]) {
				sum += a;
				cnt++;
			}
		}
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 평균 : " + ((double) sum / cnt));
	}
}
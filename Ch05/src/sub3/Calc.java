package sub3;

public class Calc {

	// 싱글톤 객체
	private static Calc instance = new Calc();

	public static Calc getInstance() {
		return instance;
	}

	private Calc() {

	}

	public static int plus(int x, int y) {
		return x + y;
	}

	public static int minus(int x, int y) {
		return x - y;
	}

	public static int multi(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}
}
package sub1;

/*
 * 날짜 : 2023/06/26
 * 이름 : 신진성 
 * 내용 : Java 예외 발생 시키기 실습하기 
 */

// 사용자 정의 예외클래스
class MinusExeption extends Exception {
	public MinusExeption(String msg) {
		super(msg);
	}
}

class OverExeption extends Exception {
	public OverExeption(String msg) {
		super(msg);
	}
}

class Score {
	public void check(int score) throws MinusExeption, OverExeption {
		if (score < 0) {
			// 예외 발생 시키기
			throw new MinusExeption("점수는 음수가 될 수 없습니다.");
		} else if (score > 100) {
			// 예외 발생 시키기
			throw new OverExeption("100점을 초과할 수 없습니다.");
		} else {
			System.out.println("점수가 정상입니다.");
		}
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		Score score = new Score();

		try {
			score.check(-3);
			score.check(102);
			score.check(96);
		} catch (MinusExeption | OverExeption e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 정상 종료...");
	}
}
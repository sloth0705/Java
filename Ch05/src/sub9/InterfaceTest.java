package sub9;

/*
 * 날짜 : 2023/06/22
 * 이름 : 신진성 
 * 내용 : Java 인터페이스 실습하기
 */
public class InterfaceTest {
	public static void main(String[] args) {
		// 인터페이스 활용1 - 표준화된 클래스 설계와 다형성 활용
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();

		Car bongo = new Truck("봉고", "남색", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();

		// 인터페이스 활용2 - 결합도 완화

		// 인터페이스 활용3 - 다중 상속 효과

	}
}
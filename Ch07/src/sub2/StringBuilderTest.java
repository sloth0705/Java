package sub2;

/*
 * 날짜 : 2023/06/27
 * 이름 : 신진성 
 * 내용 : Java StringBuilder 클래스 실습하기
 * 
 * String 클래스
 *  - String 문자열을 처리하는 클래스
 *  - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 *  - String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));

		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));

		System.out.println("str : " + str);

		// String의 immutable 성능을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));

		sb.append("Programming");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));

		System.out.println("sb : " + sb);
	}
}
package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2023/06/29
 * 이름 : 신진성 
 * 내용 : Java 역직렬화 실습하기
 */
public class DeSerializeTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Java\\Desktop\\apple.dat";
		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();

			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
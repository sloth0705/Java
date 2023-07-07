package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 날짜 : 2023/07/06
 * 이름 : 신진성 
 * 내용 : HTTP 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;

		try {
			URL url = new URL("https://google.com");
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.txt");
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			br.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
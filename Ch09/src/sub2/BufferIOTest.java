package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2023/06/29
 * 이름 : 신진성 
 * 내용 : Java 버퍼 입출력 스트림 실습하기
 * 
 * 보조스트림(버퍼)
 *  - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 */
public class BufferIOTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\Workspace2.zip";

		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);

			// 보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (true) {
				// 파일 읽기
				int data = bis.read();
				if (data == -1) {
					// 파일을 모두 읽으면 반복 종료
					break;
				}

				// 파일 쓰기
				bos.write(data);
			}
			// 스트림 해제
			bis.close();

			bos.flush();
			bos.close(); // 버퍼 비우기

			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
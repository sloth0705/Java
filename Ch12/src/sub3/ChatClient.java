package sub3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 날짜 : 2023/07/06
 * 이름 : 신진성 
 * 내용 : 채팅 프로그램 실습하기
 */
public class ChatClient {
	public static void main(String[] args) {
		System.out.println("[Client]");
		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 9001);
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);

			t1.start();
			t2.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
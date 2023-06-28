package Bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] str = new String[cnt];
		ArrayList<Character> cList = new ArrayList<>();
		for (int i = 0; i < cnt; i++) {
			str[i] = sc.next();
		}
		for (int i = 97; i <= 122; i++) {
			int cnt2 = 0;
			for (String st : str) {
				if ((char) i == st.charAt(0)) {
					cnt2++;
				}
			}
			if (cnt2 >= 5) {
				cList.add((char) i);
			}
		}
		if (cList.size() == 0) {
			System.out.println("PREDAJA");
		} else {
			for (char c : cList) {
				System.out.print(c);
			}
		}
		sc.close();
	}
}
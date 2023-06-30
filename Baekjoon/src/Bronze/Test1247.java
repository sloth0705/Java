package Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1247 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger bi0 = new BigInteger("0");
		BigInteger biA = new BigInteger("0");
		BigInteger biB = new BigInteger("0");
		BigInteger biC = new BigInteger("0");
		String a1 = "";
		String b1 = "";
		String c1 = "";

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			String str = sc.next();
			BigInteger strA = new BigInteger(str);
			biA = biA.add(strA);
		}
		if (bi0.compareTo(biA) == -1) {
			a1 = "+";
		} else if (bi0.compareTo(biA) == 0) {
			a1 = "0";
		} else if (bi0.compareTo(biA) == 1) {
			a1 = "-";
		}

		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			String str = sc.next();
			BigInteger strB = new BigInteger(str);
			biB = biB.add(strB);
		}
		if (bi0.compareTo(biB) == -1) {
			b1 = "+";
		} else if (bi0.compareTo(biB) == 0) {
			b1 = "0";
		} else if (bi0.compareTo(biB) == 1) {
			b1 = "-";
		}
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			String str = sc.next();
			BigInteger strC = new BigInteger(str);
			biC = biC.add(strC);
		}
		if (bi0.compareTo(biC) == -1) {
			c1 = "+";
		} else if (bi0.compareTo(biC) == 0) {
			c1 = "0";
		} else if (bi0.compareTo(biC) == 1) {
			c1 = "-";
		}
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		sc.close();
	}
}
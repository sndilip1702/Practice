package hackerrank;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		System.out.println(compressstr(inputString));	
		in.close();
	}

	public static String compressstr(String a) {
		if (a.length() < 2) {
			return a;
		}
		if (a.length() == 2) {
			if (a.charAt(0) == a.charAt(1)) {
				return a.charAt(0) + "2";
			} else {
				return a;
			}
		}
		for (int i = 0; i < a.length(); i++) {
			int c = i + 1;
			while (c < a.length() && a.charAt(c) == a.charAt(i)) {
				c++;
			}
			if (c - i != 1) {
				a = a.substring(0, i + 1) + (c - i) + a.substring(c);
				i++;
			}
		}
		return a;
	}

}

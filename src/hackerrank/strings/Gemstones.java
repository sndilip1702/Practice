package hackerrank.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N, i;
		N = in.nextInt();
		in.nextLine();
		String[] rocks = new String[N];
		String compareString;
		for (i = 0; i < N; i++) {
			rocks[i] = in.nextLine();
		}
		compareString = rocks[0];
		for (i = 1; i < N; i++) {
			compareString = findCommon(compareString,rocks[i]);
		}
		System.out.println(compareString.length());
		in.close();
	}
	
	public static String findCommon(String s1, String s2){
		boolean[] values = new boolean[26];
		StringBuilder returnValue = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			values[s1.toLowerCase().charAt(i) - 'a'] = true;
		}
		for (int i = 0; i < s2.length(); i++) {
			if(values[s2.toLowerCase().charAt(i) - 'a']){
				returnValue.append(s2.charAt(i));
			}
		}
		return returnValue.toString();
	}

}

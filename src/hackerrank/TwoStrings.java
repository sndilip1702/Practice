package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		String[] input = new String[2 * T];
		int i, j;
		for (i = 0; i < 2*T; i++) {
			input[i] = in.nextLine();
		}
		Map<Character, Integer> store;
		for (i = 0; i <= input.length/2; i = i + 2) {
			store = new HashMap<Character, Integer>();
			StringBuffer common = new StringBuffer();
			for (j = 0; j < input[i].length(); j++) {
				if (store.get(input[i].charAt(j)) != null)
					store.put(input[i].charAt(j), store.get(input[i].charAt(j)) + 1);
				else
					store.put(input[i].charAt(j), 1);
			}
			for (j = 0; j < input[i + 1].length(); j++) {
				if (store.get(input[i+1].charAt(j)) != null && store.get(input[i+1].charAt(j)) > 0 ) {
					store.put(input[i+1].charAt(j), store.get(input[i+1].charAt(j)) - 1);
					common.append(input[i+1].charAt(j));
				}
			}
			if(common.length()>0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}

}

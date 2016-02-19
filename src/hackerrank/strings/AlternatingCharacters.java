package hackerrank.strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T,i;
		T = in.nextInt();
		in.nextLine();
		String[] input = new String[T];
		for(i=0;i<T;i++){
			input[i] = in.nextLine();
		}
		for(i=0;i<T;i++){
			int deletions = 0;
			for (int j = 0; j < input[i].length()-1; j++) {
				if(input[i].charAt(j) == input[i].charAt(j+1)){
					deletions++;
				}
			}
			System.out.println(deletions);
		}
		
		in.close();
	}

}

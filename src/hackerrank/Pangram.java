package hackerrank;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int[] arr = new int[26];
		boolean pan = true;
		boolean multi = true;
		input = input.toLowerCase();
		int i=0,l=0;
		for(i=0;i<input.length();i++){
			if((int)input.charAt(i)>= 97 && (int)input.charAt(i) <= 122){
				arr[(int)input.charAt(i) - 'a']++;
			}
		}
		l=arr[0];
		for(i=1;i<arr.length;i++){
			if(arr[i]==0){
				System.out.println("not pangram");
				pan = false;
				break;
			}
			if(l==arr[i] && multi)
				multi = true;
			else
				multi = false;
		}
		if(pan && multi)
			System.out.println("multiple pangram "+l);
		else if(pan && !multi){
			System.out.println("pangram");
		}
		in.close();
	}

}

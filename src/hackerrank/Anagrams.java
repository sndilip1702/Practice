package hackerrank;

public class Anagrams {

	public static void main(String[] args) {
		anagrams("", "ABCD");
	}
	public static void anagrams(String prefix,String str) {
		int n = str.length();
		if(n==0)
			System.out.println(prefix);
		
		for (int i = 0; i < str.length(); i++) {
			anagrams(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1,str.length()));
		}
	}

}

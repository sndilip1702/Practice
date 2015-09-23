package hackerrank;

public class StringtoInteger {

	public static void main(String[] args) {
		String s = "123";
		char[] c = s.toCharArray();
		int i,val=0;
		for(i=0;i<c.length;i++){
			val = val * 10 + (c[i] - '0');
		}
		System.out.println(val);
	}

}

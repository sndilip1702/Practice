package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i;
		BigInteger r = BigInteger.valueOf(1);
		for(i=N;i>0;i--){
			r = r.multiply(new BigInteger(i+""));
		}
		System.out.println(r.toString());
		in.close();
	}

}

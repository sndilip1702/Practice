package hackerrankcontest;

import java.util.Scanner;

public class PerfectSet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long d = in.nextLong();
		if(N>5 && N%2 == 0)
			System.out.println(N/2 + d);
		else if (N>5 && N%2 != 0)
			System.out.println(N/2 + d + 1);
		else{
			if( N==2 || N==3 )
				System.out.println(N);
			else if(N==4)
				System.out.println((N/2 + d));
			else
				{
				System.out.println(d>1?5:3);
				}
			}
		in.close();
	}

}

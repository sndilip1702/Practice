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
		//System.out.println(perfectSetSize(N,d));
		in.close();
	}
	/*public static Long perfectSetSize(long N, long d) {
		Map<Long, Long> numbers = new HashMap<Long,Long>();
		long i;
		long count = 0;
		for(i=1;i<=N;i++){
			numbers.put(i, i);
		}
		for(i=1;i<=N/2;i++){
			if(numbers.containsKey(i) && numbers.containsKey((N+1 - i)) && i!=(N+1 - i)){
				System.out.println(i +" "+ (N+1 - i));
				count++;
				numbers.remove(i);
				numbers.remove((N+1-i));
			}
		}
		return count+d;
	}*/

}

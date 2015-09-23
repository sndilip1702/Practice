package hackerrankcontest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quantumland {
	
	/*6
 	3 80
	1 90
	2 100
	6 80
	4 90
	5 100*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] P = new int[N+1];
		int i=0;
		Map<Integer,Integer> el = new HashMap<Integer, Integer>();
		for(i=1;i<=N;i++){
			el.put(i, in.nextInt());
			P[i] = in.nextInt();
		}
		int start = 1;
		int next = start;
		int cur = el.get(start);
		float cumprob = (float)P[start]/100;
		float[] result = new float[N/2];
		int r = 0;
		el.remove(start);
		while(!el.isEmpty()){
			if(cur == start){
				result[r] = cumprob;
				r++;
				Map.Entry<Integer, Integer> e = el.entrySet().iterator().next();
				start = e.getValue();
				cur = el.get(start);
				cumprob = (float)P[start]/100;
				el.remove(start);
				continue;
			}
			cumprob *= (float)P[cur]/100;
			if(el.containsKey(cur))
				next = el.get(cur);
			el.remove(cur);
			cur = next;
		}
		
		if(r==0)
			System.out.printf("%.2f",cumprob);
		else{
			for(i=0;i<r;i++)
				cumprob+=result[i];
			System.out.printf("%.2f",cumprob);
		}
		in.close();
	}

}

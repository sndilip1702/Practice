package hackerrank;

import java.util.Scanner;

public class TruckTour {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int N;
	        N = in.nextInt();
	        long[] petrolQuantity = new long[N];
	        long[] distanceToBunk = new long[N];
	        int i;
	        for(i=0;i<N;i++){
	            petrolQuantity[i] = in.nextInt();
	            distanceToBunk[i] = in.nextInt();
	        }
	        
	        int s = 0,c = 0;
	        long curPetrol = 0L;
	        i=0;
	        while(s<=N){
	            if(petrolQuantity[i] + curPetrol < distanceToBunk[i]){
	                curPetrol = curPetrol + petrolQuantity[i] - distanceToBunk[i];
	                i = (i+1) % N;
	                c++;
	                if(c == N){
	                    System.out.println(s);
	                    break;
	                }
	            }
	            else{
	                c = 0;
	                i = (i+1) % N;
	                s = i;
	            }
	        }
	}

}

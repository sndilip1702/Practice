package prac;

import java.util.Scanner;

public class PrintPrimes {

	// Print primes till N
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt(),i,j,flag=0;
		System.out.println("Prime nos from 1 to N are : ");
		for(i=2;i<=limit;i++){
			flag = 0;
			for(j=2;j<=(i/2);j++){
				if(i!=j && (i%j)==0){
					flag = 0;
					break;
				}
				else{
					flag = 1 ;
				}
			}
			if(flag == 1){
				System.out.println(i);
			}
		}
		in.close();
	}

}

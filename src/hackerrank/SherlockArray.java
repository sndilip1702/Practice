package hackerrank;

import java.util.Scanner;

public class SherlockArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i,j;
        int[] N = new int[T];
        int[] S = new int[T];
        int[][] A = new int[T][];
        for (i=0;i<T;i++){
            N[i] = in.nextInt();
            A[i] = new int[N[i]];
            int sum = 0;
            for(j=0;j<N[i];j++){
                A[i][j]=in.nextInt();
                sum+=A[i][j];
            }
            S[i] = sum;
        }
        for(i=0;i<T;i++){
            int newSum = 0;
            boolean printFlag = false;
            for(j=0;j<N[i];j++){
                if(newSum>S[i]){
                	printFlag = true;
                    System.out.println("NO");
                    break;
                }
                else{
                	S[i]-=A[i][j];
                	if(newSum == S[i]){
                        printFlag = true;
                		System.out.println("YES");
                        break;
                    }
                    newSum+=A[i][j];
                }
            }
            if(!printFlag){
                System.out.println("NO");
            }
        }
	}
}

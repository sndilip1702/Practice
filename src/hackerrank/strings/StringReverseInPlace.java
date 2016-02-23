package hackerrank.strings;

import java.util.Scanner;

/**
 * Created by sndil on 2/22/2016.
 */
public class StringReverseInPlace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(reverseStr(input));
        System.out.println(reverseStrNoWord(input));
        in.close();
    }
    static String reverseStr(String input){
        char[] inputArr= input.toLowerCase().toCharArray();
        int l = 0, r = inputArr.length-1;
        while (l < r) {
            char temp = inputArr[l];
            inputArr[l] = inputArr[r];
            inputArr[r] = temp;
            l++;
            r--;
        }
        return new String(inputArr);
    }

    static String reverseStrNoWord(String input){
        char[] inputArr = input.toCharArray();
        StringBuilder reverseStr = new StringBuilder();
        int i = inputArr.length - 1,length = inputArr.length;
        while(i >= 0){
            if(inputArr[i] == ' '){
                reverseStr.append(input.substring(i+1,length));
                reverseStr.append(' ');
                length = i;
            }
            else if(i==0){
                reverseStr.append(input.substring(i,length));
            }
            i--;
        }
        return reverseStr.toString();
    }
}

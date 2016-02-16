package misc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Dilip
 * Input : 0?
 * Output : 00, 01 
 */
public class BinaryStringPermutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Stack<String> tempStorage = new Stack<String>();
		ArrayList<String> result = new ArrayList<String>();
		tempStorage.push(input);
		while(!tempStorage.empty()){
			String value = tempStorage.pop();
			if(value.contains("?")){
				int index = value.indexOf("?");
				tempStorage.push(value.substring(0, index) + "0" + value.substring(index+1));
				tempStorage.push(value.substring(0, index) + "1" + value.substring(index+1));
			}
			else{
				result.add(value);
			}
		}
		for (String s : result) {
			System.out.println(s);
		}
		
		in.close();
	}

}

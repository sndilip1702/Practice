package misc;

import java.util.LinkedList;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String words = "this is awesome";
		int i,startIndex=0;
		LinkedList<String> temp = new LinkedList<String>();
		for ( i = 0; i < words.length(); i++) {
			if(words.charAt(i) == ' '){
				temp.add(words.substring(startIndex,i));
				startIndex = i+1;
			}
		}
		//include the last word
		temp.add(words.substring(startIndex,i));
		for(i=temp.size()-1;i>=0;i--){
			System.out.print(temp.get(i) + " ");
		}
		
	}

}

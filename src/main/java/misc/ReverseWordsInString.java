package misc;

import java.util.LinkedList;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String sentence = "this is awesome";
        method1(sentence);
        method2(sentence);
    }

    private static void method1(String sentence) {
        int i, startIndex = 0;
        LinkedList<String> temp = new LinkedList<String>();
        for (i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                temp.add(sentence.substring(startIndex, i));
                startIndex = i + 1;
            }
        }
        // include the last word
        temp.add(sentence.substring(startIndex, i));
        for (i = temp.size() - 1; i >= 0; i--) {
            System.out.print(temp.get(i) + " ");
        }
    }

    private static void method2(String sentence) {
        String[] words = sentence.split(" ");
        String temp;
        int len = words.length, i = 0;
        while (i < len / 2) {
            temp = words[i];
            words[i] = words[len - i - 1];
            words[len - i - 1] = temp;
            i++;
        }
        for (String s : words) {
            System.out.format("%s ", s);
        }
    }
}

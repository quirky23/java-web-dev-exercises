package Chapter2;

import java.util.Scanner;

public class WordSearch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to check contents for its presence:");
        String word = input.next();
        String caseMatch = word.toLowerCase();

        input.close();

        String contents = ("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        if (contents.toLowerCase().contains(caseMatch)) {
            System.out.println("The text contains the word " + word + ", which is " + word.length() +
                    " letters long, beginning at space " + (contents.toLowerCase().indexOf(word)+1) + ".");
            String newContents = contents.toLowerCase().replaceAll(word,"");
            System.out.println(newContents);
        } else {
            System.out.println("The text does NOT contain the word " + word + ".");
        }
    }
}

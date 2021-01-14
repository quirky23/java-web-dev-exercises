package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to check: ");
        String phraseInit = input.nextLine().toLowerCase();
        String phrase = phraseInit.replaceAll("[^a-zA-Z]", "");
        char[] charactersInString = phrase.toCharArray();

        Map<Character, Integer> occurrences = new HashMap<>();
        for (char letter : charactersInString) {
            if (occurrences.containsKey(letter)) {
                occurrences.put(letter, occurrences.get(letter)+1);
            }
            else {
                occurrences.put(letter, 1);
            }
        }
    for (Map.Entry entry : occurrences.entrySet()) {
        System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    }
}

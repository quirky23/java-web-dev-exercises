package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Courtney\\Desktop","lorem.txt");
        try {
            String phraseInit = Files.readString(filePath);
            String phrase = phraseInit.replaceAll("[^a-zA-Z]", "").toLowerCase();
            char[] charactersInString = phrase.toCharArray();

            Map<Character, Integer> occurrences = new HashMap<>();
            for (char letter : charactersInString) {
                if (occurrences.containsKey(letter)) {
                    occurrences.put(letter, occurrences.get(letter)+1);
                }
                else {
                    occurrences.put(letter, 1);
                }
            } for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter text to check: ");
        String phraseInit = input.nextLine().toLowerCase();
        input.close();*/


    }
}

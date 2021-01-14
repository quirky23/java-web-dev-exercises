package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        int letters;
        String list;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter world length to search: ");
        letters = input.nextInt();
        System.out.println("Enter phrase to check: ");
        list = input2.nextLine();
        String listRev = list.replaceAll("\\."," ");
        String listRev2 = listRev.replaceAll(","," ");
      String[] words = listRev2.split(" ");
      ArrayList<String> bigWords = new ArrayList<>();
      for (String word : words) {
          if (word.length() == letters) {
              bigWords.add(word);
          }
      } System.out.println(bigWords);
    }
}

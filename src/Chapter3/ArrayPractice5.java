package Chapter3;

import java.util.Arrays;

public class ArrayPractice5 {
    public static void main(String[] args) {
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] phraseSentence = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseSentence));
    }
}

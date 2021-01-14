package Chapter3;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(14);
        numbers.add(16);
        numbers.add(17);
        numbers.add(23);
        numbers.add(46);
    for (Integer number : numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
        if ((number % 2) == 0) {
            evens.add(number);
            for (int i = 0; i < evens.size(); i++)
                sum += evens.get(i);
        }
        } System.out.println(sum);
        }
    }


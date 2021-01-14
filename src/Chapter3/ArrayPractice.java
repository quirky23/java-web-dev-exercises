package Chapter3;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for (int digit : someInts) {
            if ((digit % 2) != 0)
            System.out.println(digit);
        }

    }
}

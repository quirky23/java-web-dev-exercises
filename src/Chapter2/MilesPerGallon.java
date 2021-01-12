package Chapter2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = input.nextDouble();
        System.out.println("How many gallons have you used? ");
        gallons = input.nextDouble();
        input.close();
        double mpg = miles / gallons;
        System.out.println("You are getting " + mpg + " miles to the gallon.");

    }
}

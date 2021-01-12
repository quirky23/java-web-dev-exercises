package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        double radius = input.nextDouble();
        while (radius <= 0) {
            System.out.println("Please enter a number greater than 0");
            radius = input.nextDouble();
        }
        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is " + area + ".");
    }
}

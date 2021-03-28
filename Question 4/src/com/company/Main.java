package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Side 1 of the Triangle: ");
        double s1 = input.nextDouble();
        System.out.println("Enter Side 2 of the Triangle: ");
        double s2 = input.nextDouble();
        System.out.println("Enter Side 3 of the Triangle: ");
        double s3 = input.nextDouble();

        System.out.println("Enter the Triangle's Color: ");
        String color = input.next();

        Boolean filled = false;

        System.out.println("Color Filled?");
        filled = input.nextBoolean();

        Triangle a = new Triangle(color, filled, s1, s2, s3);
        System.out.println("\n\n"+a.toString());


    }
}

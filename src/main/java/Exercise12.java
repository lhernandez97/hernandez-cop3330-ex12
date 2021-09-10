/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //ask the user for the principal
        System.out.print("Enter the principal: ");
        int principal = in.nextInt();
        //prompt the user to give the rate of interest
        System.out.print("Enter the rate of interest: ");
        double interest = in.nextDouble();
        //prompt the user for the number of years
        System.out.print("Enter the number of years: ");
        int years = in.nextInt();
        //convert the rate of interest given by the user into a percentage
        double int_percentage = interest / 100;
        //now calculate the simple interest
        double simple_int = principal * (1 + int_percentage * years);
        //now tell the user the information
        System.out.printf("After %d years at %.1f%%, the investments will be worth $%.2f.", years, interest, simple_int);
    }
}

package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App
{
    public static void main(String arg[])
    {
        double f,c;
        Scanner input= new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.");
        String temp = input.nextLine();
        if (temp.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            f = input.nextDouble();
            c = (f - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + c);
        }
            else {
                System.out.println("Please enter the temperature in Celsius: ");
                c=input.nextDouble();
                f=((9*c)/5)+32;
                System.out.println("The temperature in Fahrenheit is "+f);
        }
    }
}
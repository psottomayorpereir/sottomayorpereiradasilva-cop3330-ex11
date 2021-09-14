/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String euros, rate;
        double val_euros, val_rate;
        double total;

        System.out.print("How many euros are you exchanging? ");
        euros=sc.nextLine();
        System.out.print("What is the exchange rate? ");
        rate=sc.nextLine();

        val_euros=Double.parseDouble(euros);
        val_rate=Double.parseDouble(rate);

        total=val_euros*val_rate;

        System.out.printf("%.2f euros at an exchange rate of %.2f is\n", val_euros, val_rate);
        System.out.printf("%.2f U.S. dollars", total);


    }
}
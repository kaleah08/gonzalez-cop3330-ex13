package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        String firstString = input.next();
        double principal = Double.parseDouble(firstString);

        System.out.print("What is the rate? ");
        String secondString = input.next();
        double rate = Double.parseDouble(secondString);

        System.out.print("What is the number of years? ");
        String thirdString = input.next();
        double years = Double.parseDouble(thirdString);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String fourthString = input.next();
        double compounded = Double.parseDouble(fourthString);


        double investment = principal * Math.pow((1 + (rate/100) / compounded) , compounded * years);
        investment = (double)Math.round(investment * 100d) / 100d;

        System.out.println("$" + String.format("%.2f",principal) + " invested at " + rate + "% for " + String.format("%.0f",years) + " years compounded " + String.format("%.0f",compounded) + " times per years is $" + investment);

    }
}

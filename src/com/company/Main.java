package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Ex. 3

        Scanner scan = new Scanner (System.in);

        int num1;
        int num2;
        int num3;

            try
            {
                System.out.println ("1st integer: ");
                num1 = scan.nextInt();
                System.out.println ("2nd integer: ");
                num2 = scan.nextInt();
                System.out.println ("3rd integer: ");
                num3 = scan.nextInt();

                if (num1 < 0 || num2 < 0 || num3 < 0)
                    throw new InputMismatchException();

                Integer.parseInt (String.valueOf (num1));
                Integer.parseInt (String.valueOf (num2));
                Integer.parseInt (String.valueOf (num3));
            }
            catch (InputMismatchException exception)
            {
                throw new InputMismatchException ("Input has to be a positive integer!");
            }

        System.out.println ("You chose these three integers: " + num1 + ", " +  num2 + "and " + num3);

            int mean = (num1 + num2 + num3) / 3;
        System.out.println ("The mean of these three integers is: " + mean);

        boolean differsbymorethan50percent = false;

        if ((num1 < mean * 0.5 || num1 > mean * 2) || (num2 < mean * 0.5 || num2 > mean * 2) || (num1 < mean * 0.5 || num1 > mean * 2))
        {
            differsbymorethan50percent = true;
            System.out.println("The integers that differ from the mean of these numbers by more than 50 %: ");
        }
            else
            System.out.println("No integers differ from the mean of these numbers by more than 50 %.");
    }
}

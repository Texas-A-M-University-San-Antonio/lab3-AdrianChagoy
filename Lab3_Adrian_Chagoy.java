/**
 * Name: [Adrian Chagoy]
 * Date: [Sep, 9 2025]
* Purpose: InClass 3 - 
* [The purpose of this code is too calculate the compund interest.]
 */

import java.util.Scanner; // import scanner for user output.

public class Lab3_Adrian_Chagoy
 {
    public static void main(String[] args) // to read input 
    {
       Scanner input = new Scanner(System.in);

       // declare the variables 
       double InitialValue; // the initial value of the house

       int elaspedyears; // the years time passed 

       double InterestRate; // intrest rate as a percentage

       double Finalvalue; // the final value

       // prompt user input for intitial value and nuber of years and the interest rate.
       System.out.println("PLease enter the InitialValue of the hosue: 200000 ");
       InitialValue = input.nextDouble();

       System.out.println("Please enter the number of elaspedyears: 25");
       elaspedyears = input.nextInt();

       System.out.println("Please enter the InterestRate:6 ");
       InterestRate = input.nextDouble();

       // covert interest rate to a decimal /100
       double rateDecimal = InterestRate / 100;

       // calculate the final value of the home value using formula A = P * (1+r)^t
       Finalvalue = InitialValue * Math.pow(1 + rateDecimal, elaspedyears);

       System.out.println("The final value of the home is: " + Finalvalue);











































    }
}
    

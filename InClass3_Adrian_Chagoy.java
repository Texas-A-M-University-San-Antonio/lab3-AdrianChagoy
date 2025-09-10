/**
 * Name: [Adrian Chagoy]
 * Date: [Sep, 9 2025]
* Purpose: InClass 3 - 
* [The purpose of this code is to take user input as the side of the cube]
 */

import java.util.Scanner; // Don't forget to import and declare a Scanner for user input.

public class InClass3_Adrian_Chagoy
{
    public static void main(String[] args) 
    {
        // reminder three major steps input processing output
        Scanner input = new Scanner(System.in);

        // In-Class 3 Example:
        // declare three variables to be used in this program, all witch a
        double side, volume, surfaceArea;

        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("PLease enter the length of the cube's side: ");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble(); // side is input by the user

        
        
        // Step 3: Use an appropriate method to determine the volume of the cube.
        //volume = side * side * side; // side "cubed" // this is corect but lets try to use mathpow
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        // the formula of the surface area is the side squared
        surfaceArea = 6 * Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method

        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        
    }
}
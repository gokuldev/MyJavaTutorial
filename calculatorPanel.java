/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gokul
 */
public class calculatorPanel {

    public static void main(String[] args) {
        // declaration of Data members
        double num1 = 0;
        double num2 = 0;
        String operator = null;
        boolean keepLooping = true;

        /* We will be getting three user inputs for which
         we create three Scanner objects*/
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Scanner userInput3 = new Scanner(System.in);
        Scanner userInput4 = new Scanner(System.in);

        // Creating the calculator object
        calculatorCore calc = new calculatorCore();

        // displaying user statements
        System.out.println("Welcome to the Calculator program!!");
        
        while (keepLooping) {
            // defining the data member needed for the while loop
            double output = 0;

            // Getting user inputs
            System.out.println("Enter the first number: ");
            num1 = userInput1.nextDouble();
            System.out.println("Enter the second number: ");
            num2 = userInput2.nextDouble();
            System.out.println("Enter the operator (+,-,*,/): ");
            operator = userInput3.nextLine();

            /* Based on the selected operator the suitable function will
             be called */
            if (operator.equals("+")) { output = calc.addMethod(num1, num2);}
            if (operator.equals("-")) {output = calc.subMethod(num1, num2);}
            if (operator.equals("*")) {output = calc.multiplyMethod(num1, num2);}
            if (operator.equals("/")) {output = calc.divideMethod(num1, num2);}
            
            System.out.println("The outcome of the operation is: " + output);
            System.out.println("Do you want to continue? (true / false)");
            try {
                keepLooping = userInput4.nextBoolean();
            } catch (InputMismatchException i) {
                keepLooping = false;
            }
        }
        System.out.println("Thanks for using my calculator program!!");
    }
}

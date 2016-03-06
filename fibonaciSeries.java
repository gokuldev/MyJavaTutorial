import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * Resources referred:
   * http://stackoverflow.com/questions/22514156/java-why-does-try-catch-block-within-a-loop-executes-only-once
   * http://stackoverflow.com/questions/13239972/how-do-you-implement-a-re-try-catch
 * */

public class fibonaciSeries {
	public static void main(String args[]) {
		// declaration of data members
		int num1 = 0;
		int num3 = 0;
		int counter = 0;
		int num2 = 1;
		int limit = 0;
		int maxTries = 2;
		boolean validInput = false;

		// inquire user on the limit of fibonacci to be generated
		System.out.println("Enter the limit to which the fibonacci series should be generated");
		while (!validInput && counter <= maxTries) {
			counter++;
			try {
				Scanner userInput1 = new Scanner(System.in);
				limit = (int) userInput1.nextInt();
				userInput1.close();
				validInput = true;
			} catch (InputMismatchException i) {
				if (counter < maxTries) {
					System.out.println("Invalid input!! User input should be an integer!!!");
				} else {
					System.out.println("Retry limit exceeded!! Exiting program");
					System.exit(0); // ?? need to know about exit codes 
				}

			}
		}

		// printing out the fibonacci series
		System.out.println("Fibonacci series begins!!");
		System.out.println(num1);
		System.out.println(num2);

		// we create a loop
		while (num2 < limit) {
			num3 = num1 + num2;
			if (num3 < limit) {
				// condition placed not to print a number greater than the user
				// specified limit
				System.out.println(num3);
			}
			num1 = num2;
			num2 = num3;
		}
	}
}

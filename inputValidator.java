import java.util.InputMismatchException;
import java.util.Scanner;

public class inputValidator {

	public int integerInputValidator(int maxTries) {
		int counter = 1;
		boolean validInput = false;
		int intInput = 0;
		while (!validInput && counter <= maxTries) {
			counter++;
			try {
				Scanner scaninp = new Scanner(System.in);
				intInput = (int) scaninp.nextInt();
				scaninp.close();
				validInput = true;				
			} catch (InputMismatchException i) {
				if (counter <= maxTries) {
					System.out.println("Invalid input!! User input should be an integer!!!");
				} else {
					System.out.println("Retry limit exceeded!! Exiting program");
					System.exit(0); // ?? need to know about exit codes
				}
			}
		}
		return intInput;
	}

}

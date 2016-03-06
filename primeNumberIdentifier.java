
public class primeNumberIdentifier {
	public static void main(String args[]) {
		// declaring data members
		int validNum = 0;
		int maxTries = 3;
		int remainder = 0;
		
		
		
		//creating local objects
		inputValidator numValidator = new inputValidator();
		
		System.out.println("Enter the number to verified whether prime or not");
		validNum = numValidator.integerInputValidator(maxTries);
		int divisor = validNum - 1;
		
		while (divisor != 0) {			
			
			if (remainder == 0 && divisor != 1) {
				System.out.println("The number entered is not a prime number");
				divisor = 0;
			} else {
				if (divisor == 1) {
					System.out.println("The number entered is a prime number");
					divisor = 0;
				} else {
					divisor--;
				}
			}
		}
	}
}

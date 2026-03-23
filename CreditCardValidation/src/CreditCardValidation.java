import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreditCardValidation {


	public static void main(String[] args) throws Exception {
		// show option
		giveOption();
		// evaluate choice
		int choice = readInputChoice();
		// 2System.out.println("You chose "+ choice);

		// 1 for entering number
		if (choice == 1) {
			String card = readInputCard();
			
			//validate card
			if (testCard(card)) {
				System.out.println("Card '" + card + "' :Valid");
			} else {
				System.out.println("Card '" + card + "' :NOT Valid");			
			}
		}

		// 2 for reading file
		else if (choice == 2) {
			System.out.println("You chose to read the credit card numbers from the file.");
			// read file
			readCards();
		} else {
			System.out.println("You have made an invalid choice.");
		}
	}

	// give option between text file and entering a number
	public static void giveOption() {

		System.out.println("What would you like to do?");
		System.out.println("1. Enter a credit card number");
		System.out.println("2. See list of credit card numbers");

	}

	public static int readInputChoice() {
		Scanner choose = new Scanner(System.in);
		int choice = choose.nextInt();
		return choice;
	}

	public static String readInputCard() {
		System.out.println("You chose to enter a number.");
		System.out.println("Please enter a 16 digit card number");
		Scanner enterNum = new Scanner(System.in);
		String enteredNum = enterNum.nextLine();
		return enteredNum;
	}

	public static void readCards() throws IOException {
		Scanner cardNums = new Scanner(new File("cardNumbers.txt"));

		while (cardNums.hasNext()) {

			String card = cardNums.nextLine();
			
			//validate card
			if (testCard(card)) {
				System.out.println("Card '" + card + "' :Valid");
			} else {
				System.out.println("Card '" + card + "' :NOT Valid");			
			}

		}
	}



	/*
	 * //validate input
	 * 
	 * //if not valid tell person not valid //if valid tell person it is valid
	 * 
	 * public static void readCards() throws IOException { Scanner cardNums = new
	 * Scanner(new File("cardNumbers.txt"));
	 * 
	 * while (cardNums.hasNext()) {
	 * 
	 * long number = cardNums.nextLong(); long[] cardNum = new long[16];
	 * 
	 * for(int i =0; i<16; i) { long digit = number%10; cardNum[i]=digit;
	 * number=number/10; }
	 * 
	 * 
	 * System.out.println(cardNum);
	 * 
	 * } }
	 * 
	 * }
	 */
	public static boolean testCard(String card) {
		boolean valid = false;
		
		// validate length is 16 characters long
		if(card.isEmpty() || card.isBlank() || card.length() != 16) {
			valid = false;
			return valid;
		}
		
		
		// validate string is a number
		try {
			long cardLong = Long.parseLong(card);
		} catch (Exception e) {
			// not a number
			valid = false;
			return valid;
			
		}
		
		
		//lun check
		char[] cardChars = card.toCharArray();
		int[] cardNums = new int[16];
		
		
		for (int i = 0; i < 16; i++) {
			if (i % 2 == 0) {
				//cardNums[i] = cardChars[i] + cardChars[i];
				// idk how to do the if there are more then one digit 
			} 
		}
		int sum = 0;
		for (int i = 0; i < 16; i++) { 
			sum= sum + cardNums[i];	
		}
	
		if(sum%10==0)

		{
			valid = true;
		}
		 return valid;
	}
}

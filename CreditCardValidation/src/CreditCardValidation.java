import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreditCardValidation {

	boolean valid = false;

	
	public static void giveOption() {
		
	System.out.println("What would you like to do?");
	System.out.println("1. Enter a credit card number");
	System.out.println("2. See list of credit card numbers");
	
	Scanner choose = new Scanner(System.in);
	int choice = choose.nextInt();

	if(choice==1){
		System.out.println("Please enter a 16 digit card number");
	Scanner enterNum = new Scanner(System.in);
		long enteredNum = enterNum.nextLong();
	}
		else if(choice== 2) {
			
	}

	
	

	public static void readCards()  throws IOException {
		Scanner cardNums = new Scanner(new File("cardNumbers.txt"));

		while (cardNums.hasNext()) {

			long number = cardNums.nextLong();
			long[] cardNum = new long[16];
			
			for(int i =0; i<16; i) {
			long digit = number%10;
			cardNum[i]=digit;
			number=number/10;
			}


			System.out.println(cardNum);

		}
	}

	}

	public static void testCards() {
		for (long i = 0; i < 16; i++) {
			if (i % 2 == 0) {
				cardNums[i] = cardNums[i] + cardNums[i];
				// idk how to do the if there are more then one digit
			}
		}
		long sum = 0;
		for (long i = 0; i < 16; i++) {
			sum = sum + cardNums[i];
		}
		if (sum % 10 == 0) {
			valid = true;
		}
	}
}

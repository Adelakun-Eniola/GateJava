import java.util.regex;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================================");
		System.out.println("\t"+ "WELCOME TO THE UTMOST CREDIT CARD CHECKER!!");
		System.out.println("===================================================");

		System.out.println("Please Enter Your Credit Card Number: ");
		String  cardNumber = sc.next();
	
		System.out.println("***********************************");
		checkValidity(cardNumber) ;
		cardAlgorithm(cardNumber);
		System.out.println("Credit Card Length Is : " +cardNumber.length());
		System.out.println("Your Card Number Is:"+cardNumber);


	}
	
	public static String checkValidity(String cardNumber){
		
		if(cardNumber.startsWith("4")){
			System.out.println("Credit Card Type: Visa Card");
		}
		if(cardNumber.startsWith("5")){
			System.out.println("Credit Card Type:  Master Card");
		}
		if(cardNumber.startsWith("37")){
			System.out.println("Credit Card Type: American Express  Cards");
		}
		if(cardNumber.startsWith("6")){
			System.out.println(" Credit Card Type: Discover Card");
		}
		return cardNumber;
	}
	
	public static void cardAlgorithm(String cardNumber){
		int total = 0;
		int totall =0;

		int length = cardNumber.length();
		int [] cardNumbers = new int[length];
	
		for(int i = 0; i < cardNumber.length(); i+=2){
			cardNumbers[i] = Character.getNumericValue(cardNumber.charAt(i));
			int numbers = cardNumbers[i]*2;
			
			int doubleDigit = 0;
			if(numbers >= 10){
				int firstRemoval = numbers % 10;
				int secondNumber = numbers /10;
				int   dDigit = firstRemoval + secondNumber;
				total+=dDigit;
			}
			
			if(numbers < 10){
				total+=numbers;
			}
		}
		//System.out.println(total);

		
		for(int j = cardNumber.length()-2;  j > 0; j -= 2){
				
		
			cardNumbers[j] = Character.getNumericValue(cardNumber.charAt(j));
			int numberz = cardNumbers[j]*2;
			
			int doubles = 0;
			if(numberz >= 10){
				int remainder = numberz % 10;
				int expected = numberz /10;
				int   totalOfTheDoubles = remainder + expected;
				totall+=totalOfTheDoubles;
			}
			
			if(numberz < 10){
				totall+=numberz;
			}

		}
		//System.out.println(totall +9);


		int finalTotal = total + totall;
		//System.out.println(finalTotal);
		if(finalTotal % 10 == 0){
			System.out.println("Validity: Card Is Valid");
		}
		else{
			System.out.println("Validity: Invalid card");
		}

	}
}
import java.util.Scanner;
public class BankeAppDriver{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		BankeApp atm = new BankeApp();
		BankeApp account1 = new BankeApp();
		
		System.out.println("WELCOME OUR DEAR ESTEEMED CUSTOMER, GLAD TO HAVE YOU!!!");
		System.out.println("Enter your First Name::");
		String fName = sc.nextLine();
	
		System.out.println("Enter your Last Name::");
		String lName = sc.nextLine();
		
		System.out.println("Enter Your Four Digit Pin:::");
		int pinEntered = sc.nextInt();
		
		atm.setName(fName, lName);
		atm.setPin(pinEntered);
		
		System.out.println("Welcome " + atm.getName());
		System.out.println("Your 4-digit Pin Is: " + atm.getPin());
		
		//System.out.println("Your Initial Balance Is: " + atm.getBalance());
		
		String menus = """
				Press:
				1. To Deposit Money
				2. To Withdraw Money
				3. To Check Account Balance
				4. To Transfer
				5. Change Pin
			""";
		System.out.print(menus);
		
		System.out.print("Enter A Number:::: ");
		int numberOption = sc.nextInt();
		switch(numberOption){
			case 1:
				System.out.println("How Much You Wanna Deposit???:");
				double amountDeposited = sc.nextDouble();
		
				if(amountDeposited < 0){System.out.println("You Can't Deposit Amount Less Than 0");}
		
				atm.setDeposit(amountDeposited);
		
				System.out.println("Your  Balance Is: " + atm.getBalance());
				System.out.println ("Deposit Successful!!!");
				break;
			
			case 2:
				System.out.print("How Much You Wanna Withdraw?: ");
				double amountWithdrawed = sc.nextDouble();

				atm.setWithdrawal(amountWithdrawed);
				
				if(amountWithdrawed >  atm.getBalance()){System.out.println("You Can't Withdraw More Than The Balance");}
				System.out.println("Your  Balance Is: " + atm.getBalance());

		
		}


		
	}
}
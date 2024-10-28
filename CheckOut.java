import java.util.Scanner;
//import java.util.LocalDate;
public class CheckOut{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What Is The Customer's Name:");
		String customerName= sc.nextLine();
	
		System.out.println("What Is The Customer Buy:");
		String productBought= sc.nextLine();

		System.out.println("How Many Pieces");
		int  numberOfProductBought= sc.nextInt();

		System.out.println("How Much Per Unit:");
		int priceOfProduct= sc.nextInt();

		System.out.println("Add more Items?");
		String options = """
			1. Yes
			2. No
		""";
		System.out.print(options);
		int answer = sc.nextInt();
		if (answer == 1){
			while(true){
				System.out.println("What Is The Customer Buy:");
				String newproductBought= sc.nextLine();
				sc.nextLine();
				System.out.println("How Many Pieces");
				int  newnumberOfProductBought= sc.nextInt();

				System.out.println("How Much Per Unit:");
				int newpriceOfProduct= sc.nextInt();

				System.out.println("Add more Items?");
				String newoptions = """
					1. Yes
					2. No
				""";
				System.out.print(options);
				int newanswer = sc.nextInt();
			
			break;

			}
		}
	
		System.out.println("What is Your Name? ");
		String cashierName= sc.nextLine();
		sc.nextLine();
		System.out.println("How Much Discount Will He Get??");
		int discount= sc.nextInt();


		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
		System.out.println("TEL : 03293828343");
		System.out.println("DATE: ");
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);
		
	}


}
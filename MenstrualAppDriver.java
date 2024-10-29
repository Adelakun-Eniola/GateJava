import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MenstrualAppDriver{
	public static void main(String [] args){
		MenstrualApp app = new MenstrualApp();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");		
		String name = scanner.nextLine();
		app.setName(name);
		System.out.println("Welcome " + app.getName());


		// last cycle
		System.out.println("Enter Your Last Month Cycle(DD/MM/YYYY): ");
		String input = scanner.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter your cycle days");
		int daysOfCycle = scanner.nextInt();


		LocalDate date = LocalDate.parse(input,formatter);
		getCycle(date);
		getOvulationPeriod(date, daysOfCycle);
		fertilityPeriod(date,  daysOfCycle,  ovulationPeriod);
	}

		


		public static void getCycle(LocalDate date){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your cycle days");
			int daysOfCycle = scanner.nextInt();
			do {
        			System.out.println("Enter your cycle days (21-35):");
        			daysOfCycle = scanner.nextInt();
  			 } while (daysOfCycle <= 21 || daysOfCycle >= 35);
			
			LocalDate nextCycle = date.plusDays(daysOfCycle);
			System.out.println("Your next cycle starts on the :" + nextCycle);
		}


		public static void  getOvulationPeriod(LocalDate date, int daysOfCycle){
			int ovulateDays = daysOfCycle/2;
			LocalDate ovulationPeriod = date.plusDays(ovulateDays);
			System.out.println("Your Ovulation Starts On The: " + ovulationPeriod);
			
		}


		public static void fertilityPeriod(LocalDate date, int daysOfCycle, LocalDate ovulationPeriod){
				
			LocalDate dangerousPeriod = ovulationPeriod.minusDays(3);
			System.out.println("Your Fertility Period Starts On : " + dangerousPeriod  + "and ends on : " + ovulationPeriod);

					
		}

}

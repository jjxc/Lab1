//Jonathan Chang , Billy Mullins , Bruce Scheibe
import java.util.Scanner;

public class retirementCalculator {
	
	
	public static void main(String[] args) {
		Scanner datainput=new Scanner(System.in);
		//Local Variables
		double yearsWorked;
		double interestWorking;
		double yearsRetired;
		double interestRetired;
		double requiredIncome;
		double monthlyssi;
		
		//Questions being asked and inputs
			System.out.println("How many years worked:");
			yearsWorked=datainput.nextDouble();
			
			do{
			System.out.println("What is the annual return rate while working (decimal):");
			interestWorking=datainput.nextDouble();
			} while (interestWorking<=0 || interestWorking>.2);	
				
				
			System.out.println("How many years retired:");
			yearsRetired=datainput.nextDouble();
			
			do{
			System.out.println("What is the annual return rate while retired (decimal):");
			interestRetired=datainput.nextDouble();
			} while (interestRetired<=0 || interestRetired>.03);
			
			System.out.println("What is the desired monthly income:");
			requiredIncome=datainput.nextDouble();
			
			System.out.println("What is the monthly SSI:");
			monthlyssi=datainput.nextDouble();
			
			//Calculations
			double Annuity = 
					(requiredIncome - monthlyssi) * ((1 - (1 / (Math.pow((1 + (interestRetired/12)), yearsRetired*12)))) / (interestRetired/12));
			
			double monthlyNeeded =
					(Annuity * (interestWorking/12))/((Math.pow(1 + (interestWorking/12),yearsWorked * 12)) - 1);

			//Results rounded to 2 decimal places
			System.out.printf("Total Money Needed: $% .2f \n",Annuity);
			
			System.out.printf("Monthly Saved Needed: $% .2f \n",monthlyNeeded);

	}

}

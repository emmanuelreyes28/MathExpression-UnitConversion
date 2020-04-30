import java.util.Scanner;
import java.lang.Math;

public class unitConversion {
	//1 meter = 39.3700787;
	
	//asks for measurement in meters and checks for valid input
	//then converts the input to feet and inches 
	public unitConversion() {
		Scanner s = new Scanner(System.in); //Scanner
		System.out.print("Please provide a measurement in meters: ");
		while(s.hasNextFloat() == false) { //while loop: checks if input is valid
			System.out.println("Invalid input.");
			System.out.print("Please provide a measurement in meters: ");
			s = new Scanner(System.in); // assigns user input to s 
		}
		
		//variables
		float input = s.nextFloat();
		double inches = input * 39.3700787;
		double feet = inches/12;
		double in = Math.round(inches%12);
		
		// if number of inches is greater than 12 then it adds 1 to feet
		// restart in at 0 
		if (in >= 12) {
			feet += 1;
			in = 0;
		} 
			
		System.out.printf("%d ft %d in", (int)feet, (int)in); //prints to console
		s.close(); //closes scanner 
		} 
	


	
}

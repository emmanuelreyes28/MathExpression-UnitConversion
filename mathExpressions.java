import java.util.Scanner;
import java.lang.Math;

public class mathExpressions {
	//class variables 
	private Scanner s;
	public double x;
	public double y;
	public double z;
	
	// checks if user input is valid then stores value into corresponding variable 
	public mathExpressions() {
		s = new Scanner(System.in);
		System.out.println("Please provide a double precision floating point for every variable shown.");
		
		System.out.print("x = ");
		while(s.hasNextDouble() == false) {
			System.out.println("Invalid input.");
			System.out.println("Please provide a double precision floating point for every variable shown.");
			System.out.print("x = ");
			s = new Scanner(System.in);
		}
		x = s.nextDouble();
		//System.out.println("hello"  + x);
		
		System.out.print("y = ");
		while(s.hasNextDouble() == false) {
			System.out.println("Invalid input.");
			System.out.println("Please provide a double precision floating point for every variable shown.");
			System.out.print("y = ");
			s = new Scanner(System.in);
		}
		y = s.nextDouble();
		
		System.out.print("z = ");
		while(s.hasNextDouble() == false) {
			System.out.println("Invalid input.");
			System.out.println("Please provide a double precision floating point for every variable shown.");
			System.out.print("z = ");
			s = new Scanner(System.in);
		}
		z = s.nextDouble();
	}	
	
	//returns the average of user input 
	public double average() {
		System.out.print("The average is ");
		return (x + y + z)/3.0;
	}
	
	//returns the cosine of user input
	public double cosine() {
		System.out.print("The cosine is ");
		double answer =((x+y)/z); 
		return (Math.cos(answer));
	}
	
	//returns the cubeRoot of x 
	public double cubeRoot() {
		System.out.print("The cube root of x is ");
		return Math.cbrt(x);
	}
	
	//returns x raised to the power of y 
	public double exponent() {
		System.out.print("x raised to the power of y ");
		return Math.pow(x, y);
	}
	
	//returns the base 10 log for x 
	public double log() {
		System.out.print("The base 10 log for x is ");
		return Math.log10(x);
		
	}
	

}



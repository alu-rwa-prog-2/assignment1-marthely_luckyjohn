//Authors: Marthely & Lucky John

import java.util.Scanner;
public class BMICalculator {

	private static Scanner sc;
	private static String yourName;
	private static Scanner in;

	public static void main(String[] args) {
		
		
// Input the weight and the height of a person (declaring variables)	
	      sc = new Scanner(System.in);
	      System.out.print("Enter your name: ");
	      yourName = sc.next();
	      System.out.print("Input the weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("\n Input the height in meters: "); 
	      double height = sc.nextDouble();
	      
// Calculating the BMI and  printing the result
	      double BMI = weight / (height * height);
	      System.out.print("\n Hello " + yourName +" your Body Mass Index (BMI) is " + BMI + " kg/m2");

	        float length, width, area, perimeter;

	        in = new Scanner(System.in);


	        // Input length and width of rectangle
	        System.out.print("\nInput the length of the rectangle: ");
	        length = in.nextFloat();
	        
	        System.out.print("\nInput the width of the rectangle: ");
	        width  = in.nextFloat();

	        
	        // Calculating the perimeter of the rectangle
	        perimeter = (length + width)* 2 ;

	        // Calculating the area of the rectangle 
	        area = length * width;

	        
	        // Printing the perimeter and the area of the rectangle
	        System.out.println("The Perimeter of the rectangle is " + perimeter + " m");
	        System.out.println("The Area of the rectangle is " + area + " m2");
	        

	}

}

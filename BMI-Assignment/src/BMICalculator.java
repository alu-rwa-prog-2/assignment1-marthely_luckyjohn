//Authors: Marthely & Lucky John

import java.util.Scanner;
public class BMICalculator {

	private static Scanner sc;

	public static void main(String[] args) {
// Input the weight and the height of a person (declaring variables)	
	      sc = new Scanner(System.in);
	      System.out.print("Input the weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("\n Input the height in meters: "); 
	      double height = sc.nextDouble();
	      
// Calculating the BMI and  printing the result
	      double BMI = weight / (height * height);
	      System.out.print("\n Hello Ella, your Body Mass Index (BMI) is " + BMI + " kg/m2");
	}

}

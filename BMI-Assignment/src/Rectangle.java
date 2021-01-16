//Authors: Marthely & Lucky John

import java.util.Scanner;
public class Rectangle {

	private static Scanner in;

	public static void main(String[] args) {
        float length, width, area, perimeter;

        in = new Scanner(System.in);


        // Input length and width of rectangle
        System.out.print("Input the length of the rectangle: ");
        length = in.nextFloat();
        
        System.out.print("Input the width of the rectangle: ");
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

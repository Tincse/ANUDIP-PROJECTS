package question1;
import java.util.*;
public class ShapesMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Area ar=new Area();//instantiation of class area
		//Taking values of length and  breadth of rectangle from user
		System.out.println("Enter the length and breadth of a rectangle:");
		double len=scan.nextDouble();
		double breadth=scan.nextDouble();
		//Taking value of side of square from user
		System.out.println("Enter the side  of a square:");
		double side=scan.nextDouble();
		//Taking value of radius of circle from user
		System.out.println("Enter the radius of a circle:");
		double radius=scan.nextDouble();
		System.out.println("Displaying the areas  of rectangle , square and circle :");
		ar.rectangleArea(len, breadth);//calling the method rectangleArea by passing its length and breadth as parameters
		ar.squareArea(side);//calling the method squareArea by passing its side as parameter
		ar.circleArea(radius);//calling the method circleArea by passing its radius as parameter

	}

}

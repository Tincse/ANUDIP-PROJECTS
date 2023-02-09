package question1;
//a class which is implementing the interface shape and description of all the abstract class of that interface
public class Area implements Shape {

	@Override
	public void rectangleArea(double l, double b) {//overrided method to calculate area
		System.out.println("The area of rectangle of is="+(l*b));//printing the area of rectangle
		//return statement
	}

	@Override
	public void squareArea(double a) {//overrided method to calculate area
		System.out.println("The area of a square of side is="+(a*a));//printing the area of square
		
	}

	@Override
	public void circleArea(double r) {//overrided method to calculate area
		System.out.println("The area of a circle is="+(PI*r*r));//printing the area of circle and taking access of variable PI declared in interface shape
	}
	

}

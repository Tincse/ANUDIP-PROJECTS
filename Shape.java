package question1;

public interface Shape //declaring an interface named shape
{
	static double PI=3.14;//declaring the value of pie for area calculation
	//Declaring three abstract methods
    public  void rectangleArea(double l,double b);//declaring abstract method for area calculation of rectangle with two parameters describing its length and breadth
    public  void squareArea(double a);//declaring abstract  method for area calculation of square  with one parameter describing its side
    public  void circleArea(double r);//declaring abstract method for area calculation of circle  with one parameter describing its radius;
}

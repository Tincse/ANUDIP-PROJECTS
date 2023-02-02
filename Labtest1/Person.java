package Labtest1;

public class Person 
{
	//declaring data members as private
private String name;
   private int age;
   private String address;
   private String mobile_no;
   //default constructor
   public Person() {
		super();
	}
   //parameterized constructor
   public Person(String name, int age, String address, String mobile_no) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobile_no = mobile_no;
	}
   // displaying the details of person
    public void display() 
    {
    	System.out.println("The name of the person is.."+name);
    	System.out.println("The age of the person is.."+age);
    	System.out.println("The address of the person is.."+address);
    	System.out.println("The mobileno of the person is.."+mobile_no);
    }
}

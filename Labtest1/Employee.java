package Labtest1;
// inheriting the class person
public class Employee extends Person 
{
	//declaring data members as private
	private int e_id;
    private String dept;
    private int salary;
    public Employee()//default constructor
    {
    	e_id=0;
    	dept="";
    	salary=0;
    }
    //parameterized constructor
    public Employee(String name,int age,String address,String mobile_no,int e_id, String dept, int salary) {
		super(name,age,address,mobile_no);
		this.e_id = e_id;
		this.dept = dept;
		this.salary = salary;
	}
    //displaying the details of employee
	public void displayEmp()   
	{
		display();//calling the display method of parent class person
		System.out.println("The employee id is.."+e_id);
		System.out.println("The employee department is.."+dept);
		System.out.println("The employee salary is.."+salary);
	}
	
}

package Labtest1;

public class EmpMain {

	public static void main(String[] args) 
	{
		// creating object of the child class employee
		Employee emp=new Employee("Ayndrila",21,"Mohispota sodepur","9874385368",56,"Development",66000);//passing parameters to the parameterized constructor of employee
		    emp.displayEmp();//calling the method displayEmp to show the details 
	}

}

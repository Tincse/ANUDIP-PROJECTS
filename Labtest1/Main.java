package Labtest1;

public class Main 
{

	public static void main(String[] args) {
		Oddnos ob=new Oddnos();//creating object of Oddnos class
	    Alternatearray ar=new Alternatearray();//creating object of Alternatearray class
	        System.out.println("The odd nos from 1 to 20 are...");
	          	ob.display();//calling display method of Oddno class
	          	System.out.println();
	        System.out.println("The sum of alternate elements is...");	
	          	ar.sumcalc();//calling sumcalc method of Alternatearray class 
	}

}

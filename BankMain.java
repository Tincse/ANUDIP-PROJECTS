package question2;

public class BankMain {

	public static void main(String[] args) {
		BankA bA = new BankA();//instantiation of Bank A class
        System.out.println("The amount deposited by a boy in Bank A is"+bA.GetBalance());//printing the deposited amount in Bank A

        

        BankB bB = new BankB();//instantiation of Bank B class
        System.out.println("The amount deposited by a boy in Bank B is"+bB.GetBalance());//printing the deposited amount in Bank B
       
        

        BankC bC = new BankC();//instantiation of Bank C class
        System.out.println("The amount deposited by a boy in Bank C is"+bC.GetBalance());//printing the deposited amount in Bank C
       
	}

}

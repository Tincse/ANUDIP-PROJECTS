package question3;
import java.util.*;
public class DuplicateValues 
{
    public void duplicatestringvalues()
    {
    	Scanner scan=new Scanner(System.in);//instantiation of scanner class
    	int n,found=0;
    	System.out.println("Enter the no of strings in the string array:");
    	n=scan.nextInt();// taking the no of strings as input from user
    	String arr[]=new String[n];//declaring a string array of n numbers
    	System.out.println("Enter the strings to be inserted in the array:");//prompting the user to input the string values
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=scan.next();//taking input from user
    	}
    	for(int i=0;i<arr.length;i++)//outer loop
    	{
    		for(int j=i+1;j<arr.length;j++)//inner loop 
    		{
    			if(arr[i].equalsIgnoreCase(arr[j]) && i!=j)//checking for if the string values are same
    			{
    				found=1;
    				System.out.println("The duplicate values of an array of string values are:"+arr[j]);//printing the duplicate values
    			}
    		}
    		
    	}
    	if(found==0)
			System.out.println("No duplicate values are found in the array");//if there is no duplicate values a message is provided to the user
    	
    }
}

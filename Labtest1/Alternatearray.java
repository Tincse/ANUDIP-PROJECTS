package Labtest1;

public class Alternatearray
{
	// initialization of first array
    int a[]= {1,2,3,4,5,6,7,8,9,10};
    int n=a.length;//length of first array
    int b[]= new int[n];//second array 
    int sum=0;//initializing sum to 0
    public void sumcalc()
    {
    for(int i=0;i<n;i++)
    {
    	if(i%2==0)
    	b[i]=a[i];//copying alternate elements to second array
    }
    for(int i=0;i<n;i++)
    {
    	sum+=b[i];//calculating sum of alternate elements
    }  
    System.out.println(sum);//displaying sum
  }
}

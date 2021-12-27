package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) 
	{

      System.out.println("Please Enter number for check");
      int num=1211, rev=0,num1,a;
      a=num;
    	while(num>0)  
      {
    	  num1=num%10;
    	  rev=rev*10+num1;
    	  num=num/10;
      }
    	
    	if(rev==a)
    	{
    		System.out.println("Given number is Palindrome number "+rev);
    	}
    	else
    	{
    		System.out.println("Given number is not Palindrome number "+rev);
    	}

	}

}

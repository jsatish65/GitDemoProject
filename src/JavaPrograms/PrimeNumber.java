package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num=99;
		boolean prime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				 prime=false;
				
			}
		}
		
		if(prime==true)
		{
			System.out.println("Given Number is prime " +num);
		}
		else
		{
			System.out.println("Given Number is not prime number " +num);
		}

	}

}

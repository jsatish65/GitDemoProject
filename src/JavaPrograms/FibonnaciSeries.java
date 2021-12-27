package JavaPrograms;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int usInput=sc.nextInt();
		int a=0,b=1,c;
		
		for(int i=0;i<=usInput;i++)
		{
			System.out.print(+a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}

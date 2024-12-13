package exam;
import java.util.Scanner;
public class ExceptionHandling {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		
		int r;
		try
		{
			r=num1/num2;
			System.out.println("Result "+ r);

		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException " +e);
		}
		
		
		//NumberFormatException
		String s1="12";
		String s2="3";
		int b;
		try {
			
		b=Integer.parseInt(s2);
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid String"+e);
		}
		
		//ArrayIndexOutOfBoundsException
		
		int a[]=new int[5];
		try
		{
			a[6]=10;
			System.out.println("Accessing element "+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException"+e);
			
		}
	}

}

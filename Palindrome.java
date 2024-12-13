package exam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Palindrome {

	static int count=0;
	static void palindrome(String x)
	{
		StringBuilder s1=new StringBuilder(x);
		
		if(x.equals(s1.reverse().toString()))
		{
			System.out.println(x + " is a palindrome");
			count+=1;
		}
		else
		{
			System.out.println(x + " is not palindrome");

		}
				
	}
	
	static void even_odd(int x)
	{
		if(x%2==0)
		{
			System.out.println(x + " is even number");
			count+=1;

		}
		else
		{  
			System.out.println(x + " is a odd number");

		}
	}
	
	static void prime(int x)
	{
		boolean flag=false;
		for(int i=2;i<=x/2;++i)
		{
			if(x%i==0)
			{
				flag=true;
			}
			
		}
		if(!flag)
		{
			System.out.println(x + " is a Prime number");
			count+=1;

		}
		else
		{
			System.out.println(x + " is a non-prime number");

		}
	}
	
	static void check(int ch, int x)
	{
		switch(ch)
		{
		case 1:
			even_odd(x);
			break;
			
		case 2:
			prime(x);
			break;
			
		case 3:
			System.out.println("Enter valid choice");
		}
		
	}
	
	static void number_op()
	{
		int elements, choice, n;
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>nums=new ArrayList<Integer>();
		
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			elements=sc.nextInt();
			nums.add(elements);
		}
		
		System.out.println("Enter operation to be performed");
		System.out.println("1. EVEN OR ODD");
		System.out.println("2. PRIME OR NON-PROIME");
		choice=sc.nextInt();
		
		Iterator itr=nums.iterator();
		count=0;
		while(itr.hasNext())
		{
		check(choice, (int) itr.next());
		}
		if(choice==1)
		{
			System.out.println("The number of even numbers are" + count);
			System.out.println("The number of odd numbers are" + (nums.size()-count));
		}

		else
		{
			System.out.println("The number of Prime numbers are" + count);
			System.out.println("The number of non-prime numbers are" + (nums.size()-count));
		}
	}
	
	static void string_op()
	{
		String word;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String>words=new ArrayList<String>();
		
		System.out.println("Enter the number of elements");
		word=sc.next();
		System.out.println("Enter elements");
		for(int i=0;i<2;i++)
		{
			word=sc.next();
			words.add(word);
		}
		count=0;
		for(String w: words)
		{
			palindrome(w);
		}
		System.out.println("number of palindrome elements are"+ count);

	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the type");
		System.out.println("1. Integer");
		System.out.println("2. String");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			number_op();
		}
		else
		{
			string_op();
		}
	}
}


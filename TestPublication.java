package exam;
import java.util.*;
public class TestPublication {
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	book b=new book();
	magazine m=new magazine();
	b.setTotal(0);
	m.setTotal(0);
	b.readBook();
	m.readMagazine();
	do {
	System.out.println("Enter CHOOSE ");
	System.out.println("1:\t for sell book ");
	System.out.println("2:\t for sell magazine ");
	System.out.println("3:\t for total sell ");
	System.out.println("4:\t for terminate");
	int k=sc.nextInt();
	switch (k)
	{
	case 1:
	System.out.print("Number of book copies you want: ");
	int n1=sc.nextInt();
	b.sellCopy (n1);
	System.out.println("Books "+n1+" sold");
	break;
	case 2:
	System.out.print("Number of magazine copies you want: ");
	n1=sc.nextInt();
	m.sellCopy (n1);
	System.out.println("magazine "+n1+" sold");
	break;
	case 3:
	System.out.println("Total book sell value= "+b.getTotal());
	System.out.println("Total magazine sell value="+m.getTotal());
	break;
	case 4:
	System.exit(0);
	default:
	System.out.println("invalid choice");
	}
	}while(true);
	}

}

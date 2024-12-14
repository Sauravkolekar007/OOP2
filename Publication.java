package exam;
import java.util.Scanner;
public class Publication {

	
		private String title;
		private int price;
		private int copies;
		private int total;
		public void setTitle(String title) 
		{
		this.title=title;
		}
		public String getTitle() 
		{
		return title;
		}
		public int getPrice() 
		{
		return price;
		}
		public void setPrice(int price) 
		{
		this.price = price;
		}
		public void setCopies(int copies) 
		{
		this.copies=copies;
		}
		public int getCopies() 
		{
		return copies;
		}
		public void setTotal(int total) 
		{
		this.total = total;
		}
		public int getTotal() 
		{
		return total;
		}
		public void sellCopy(int number) 
		{
		if (number <= copies) 
		{
		copies = copies - number;
		total = total + number * price;
		}
		else
		System.out.println("Insufficient copies available");
		}
}
	
	
	class book extends Publication 
	{
	private String author;
	Scanner sc=new Scanner(System.in); 
	public void orderCopies(int number) 
	{ 
	int x=getCopies() + number;
	setCopies( x );
	}
	public void readBook() 
	{
	System.out.print("enter title : ");
	setTitle(sc.nextLine() );
	System.out.print("enter price: ");
	setPrice(sc.nextInt());
	System.out.print("enter number of copies: ");
	setCopies(sc.nextInt());
	System.out.print("enter author of book: ");
	author=sc.next();
	}
	public void displayBook()
	{
	System.out.println("title \t price \t copy \t author");
	System.out.print(getTitle()+"\t"+getPrice()+"\t"+getCopies()+"\t"+author);
	System.out.println("Total= "+getTotal());
	}
	
}

	
	class magazine extends Publication 
	{
	int orderQuantity;
	private String issueDate;
	Scanner sc=new Scanner(System.in);
	public void receiveIssue(int number, String issueDate) 
	{
	int x=getCopies() + number;
	setCopies( x );
	this.issueDate = issueDate;
	}
	public void readMagazine () 
	{
	System.out.print("enter title : ");
	setTitle(sc.nextLine() );
	System.out.print("enter price: ");
	setPrice(sc.nextInt());
	System.out.print("enter number of order quantities: ");
	setCopies(sc.nextInt());
	orderQuantity = getCopies();
	System.out.print("enter issue date of Magazine: ");
	issueDate =sc.next();
	}
	public void displayMagazine ()
	{
	System.out.println("title \t price \t copy \t issueDate ");
	System.out.print(getTitle()+"\t"+getPrice()+"\t"+getCopies()+"\t"+ issueDate);
	System.out.println("Total= "+getTotal());
	}
	}


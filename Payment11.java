package exam;

public interface Payment11 {

	public void pay(int amount);

}

package exam;

public class Credit implements payment1 {
	
	private String name;
	private String card_no;
	private String cvv;
	private String DateOFExpiry;
	
	public Credit(String n, String a, String c, String d)
	{
		this.name=n;
		this.card_no=a;
		this.cvv=c;
		this.DateOFExpiry=d;
	}

	public void pay(int amount)
	{
		System.out.println(amount + "paid amount by credit card");
	}
}


package exam;

public class paypa implements payment1 {
	
	private String Eamil_id;
	private String Password;
	
	public paypa(String e, String p)
	{
		this.Eamil_id=e;
		this.Password=p;
	
	}
	
	public void pay(int amount)
	{
		System.out.println(amount + "paid by Paypal");
	}

}

package exam;

public class Item1 {
	
	private String upcCode;
	private int price;
	
	public Item1(String u, int p)
	{
		this.upcCode=u;
		this.price=p;
	}

	public String getupcCode()
	{
		return upcCode;
	}
	
	public int getPrice()
	{
		return price;
	}
}

package exam;
import java.util.*;
import java.util.ArrayList;
public class ShoppingCart1 
{
	
	List<Item>items;
	
	public ShoppingCart1()
	{
		this.items=new ArrayList<Item>();
	}
	public void addItem(Item item)
	{
		this.items.add(item);
		
	}

	public void removeItem(Item item)
	{
		this.items.remove(item);
	}
	
	public int calculateTotal()
	{
		int sum=0;
		for(Item item:items)
		{
			sum+=item.getPrice();
		}
		return sum;
		
	}
	
	public void pay(payment1 PaymentMethod)
	{
		int amount=calculateTotal();
		PaymentMethod.pay(amount);
	}
}


package exam;

public class ShoppingCartTest1 {

	public static void main(String[] args) {
		
		ShoppingCart1 cart=new ShoppingCart1();
		
		Item item1=new Item("7638",9018);
		Item item2=new Item("2837", 8698);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new Credit("Saurav", "0983988", "789", "11/27"));
		cart.pay(new paypa("saurav@899gmail.com", "pwd123"));

	}

}



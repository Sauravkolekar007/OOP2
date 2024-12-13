package exam;
import java.util.Scanner;
public class Emp3 {

	public static void main(String args[])
	{
		int choice, cont;
		
		do
		{
			System.out.println("PAY ROLL FOR SOFTWARE COMPANY");
			System.out.println("\n 1.Programmer \n 2.Team Leader \n 3.Assistant Project Manager \n 4.Project_Manager");
			System.out.println("Enter your Choice 1-4");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				progrmmer p=new progrmmer();
				p.getdata();
				p.getprogrmmer();
				p.display();
				p.calculate();
				break;
				
			case 2:
				TeamLeder t=new TeamLeder();
				t.getdata();
				t.getTeamLeder();
				t.display();
				t.calculate();
				break;
				
			case 3:
				Assistant_manager a=new Assistant_manager();
				a.getdata();
				a.getAssistant_manager();
				a.display();
				a.calculate();
				break;
				
			case 4:
				Project_manger p1=new Project_manger();
				p1.getdata();
				p1.getProject_manger();
				p1.display();
				p1.calculate();
				break;
			}
			
			System.out.println("Do you want continue? For yes Enter 1, For No Enter 0 ");
			cont=sc.nextInt();
		}while(cont==1);
	}
}

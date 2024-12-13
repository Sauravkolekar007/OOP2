
package exam;
import java.util.Scanner;
public class Employeee
{
	private String Name;
	private int emp_id;
	private String Address;
	private String Mail;
	long mob_no;
	
	Scanner sc=new Scanner(System.in);
	
	public void getdata()
	{
		System.out.println("Enter the name of the employee");
		Name=sc.nextLine();
		System.out.println("Enter the id of the employee");
		emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Address of the employee");
		Address=sc.nextLine();
		System.out.println("Enter the Mail of the employee");
		Mail=sc.nextLine();
		System.out.println("Enter the Mobile number of the employee");
		mob_no=sc.nextLong();
	}
	public void display()
	{
		System.out.println("Employee Name    :" + Name);
		System.out.println("Employee Id      :" + emp_id);
		System.out.println("Employee Address :" + Address);
		System.out.println("Employee MAil_id :" + Mail);
		System.out.println("Employee Mob_no  :" + mob_no);

	}

}

class progrmmer extends Employeee
{
	double bp, da, hra,pf, club,  gross, net;
	void getprogrmmer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
	}
	
	void calculate() 
	{
		da=(0.97*bp);
		hra=(0.12*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		
		System.out.println("******************************************");
		System.out.println("PAY SLIP FOR PROGRAMMER");
		System.out.println("******************************************");
		System.out.println("Basic Pay : Rs " + bp);
		System.out.println("DA : RS " + da);
		System.out.println("HRA : RS " + hra);
		System.out.println("PF : RS " + pf);
		System.out.println("Club : RS " + club);
		System.out.println("Gross Salary : RS " + gross);
		System.out.println("Net Salary : RS " + net);
		System.out.println("______________________________________________");

	}
}

class TeamLeder extends Employeee
{
	double bp, da, hra,pf, club,  gross, net;
	void getTeamLeder()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
	}
	
	void calculate() 
	{
		da=(0.97*bp);
		hra=(0.12*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		
		System.out.println("******************************************");
		System.out.println("PAY SLIP FOR TEAM LEADER");
		System.out.println("******************************************");
		System.out.println("Basic Pay : Rs " + bp);
		System.out.println("DA : RS " + da);
		System.out.println("HRA : RS " + hra);
		System.out.println("PF : RS " + pf);
		System.out.println("Club : RS " + club);
		System.out.println("Gross Salary : RS " + gross);
		System.out.println("Net Salary : RS " + net);
		System.out.println("______________________________________________");

	}
}

class Assistant_manager extends Employeee
{
	double bp, da, hra,pf, club,  gross, net;
	void getAssistant_manager ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
	}
	
	void calculate() 
	{
		da=(0.97*bp);
		hra=(0.12*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		
		System.out.println("******************************************");
		System.out.println("PAY SLIP FOR ASSISTANT MANAGER");
		System.out.println("******************************************");
		System.out.println("Basic Pay : Rs " + bp);
		System.out.println("DA : RS " + da);
		System.out.println("HRA : RS " + hra);
		System.out.println("PF : RS " + pf);
		System.out.println("Club : RS " + club);
		System.out.println("Gross Salary : RS " + gross);
		System.out.println("Net Salary : RS " + net);
		System.out.println("______________________________________________");

	}
}

class Project_manger extends Employeee
{
	
	double bp, da, hra,pf, club,  gross, net;
	void getProject_manger ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
	}
	
	void calculate() 
	{
		da=(0.97*bp);
		hra=(0.12*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		
		System.out.println("******************************************");
		System.out.println("PAY SLIP FOR PROJECT MANAGER");
		System.out.println("******************************************");
		System.out.println("Basic Pay : Rs " + bp);
		System.out.println("DA : RS " + da);
		System.out.println("HRA : RS " + hra);
		System.out.println("PF : RS " + pf);
		System.out.println("Club : RS " + club);
		System.out.println("Gross Salary : RS " + gross);
		System.out.println("Net Salary : RS " + net);
		System.out.println("______________________________________________");

	}
}
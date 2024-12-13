package exam;

public class Main5 {
public static void main(String args[])
{
	Vehicle bicycle=new Bicycle();
	Vehicle bike=new Bike();
	Vehicle car=new Car();
	
	System.out.println("******Bicycle*******");
	bicycle.GearChange(2);
	bicycle.SpeedUp(20);
	bicycle.ApplyBrakes(5);
	
	System.out.println("******Bike*******");
	bike.GearChange(4);
	bike.SpeedUp(60);
	bike.ApplyBrakes(10);
	
	System.out.println("******Car*******");
	car.GearChange(5);
	car.SpeedUp(90);
	car.ApplyBrakes(30);
	
}
}

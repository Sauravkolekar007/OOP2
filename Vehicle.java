package exam;

public interface Vehicle {
	

	public void GearChange(int gear);
	public void SpeedUp(int increment);
	public void ApplyBrakes(int decriment);

}

class Bicycle implements Vehicle
{
	int speed;
	int gear;
	
	public void GearChange(int gear)
	{
		this.gear=gear;
		System.out.println("Bicycle gear change" + gear);
		
	}
	public void SpeedUp(int increment)
	{
		speed+=increment;
		System.out.println("Bicycle speed increased " + speed);
	}
	
	public void ApplyBrakes(int decriment)
	{
		speed-=decriment;
		System.out.println("Bicycle speed reduced to" +speed);
	}
}

class Bike implements Vehicle
{
	int speed;
	int gear;
	
	public void GearChange(int gear)
	{
		this.gear=gear;
		System.out.println("Bike gear changed to " + gear);
		
	}
	
	public void SpeedUp(int increment)
	{
		speed+=increment;
		System.out.println("Bike speed increased to " + speed);
	}
	
	public void ApplyBrakes(int decriment) 
	{
		speed-=decriment;
		System.out.println("bike speed is reduced to " + speed);
	}
}

class Car implements Vehicle
{
	int speed;
	int gear;
	
	public void GearChange(int gear)
	{
		this.gear=gear;
		System.out.println("Car gear changed to " + gear);
		
	}
	
	public void SpeedUp(int increment)
	{
		speed+=increment;
		System.out.println("Car speed increased to"+ speed);
	}
	
	public void ApplyBrakes(int decriment)
	{
		speed-=decriment;
		System.out.println("Car Speed reduced to  " + speed);
	}
}

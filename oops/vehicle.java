package oops;
class Feature
{
	int gear ;
	int engine;
	int tyre ;

public void petrol()
{
	System.out.println("may be");
}

public void disel()
{
	System.out.println("it speed");
}
}

class Car extends vehicle
{
	public void wheel4()
	{
		System.out.println("long distance");	
	}
}

class Truck extends vehicle
{
	public void wheel8()
	{
		System.out.println("logistics");	
	}
}

class Scooter extends vehicle
{
	public void wheel2()
	{
		System.out.println("general purpose");	
	}
}


public class vehicle {

public static void main(String[] args) {
Feature v = new Feature();
		
		v.petrol();
		v.disel();
		v.gear = 4;
		System.out.println(v.gear);
		
		Truck t = new Truck();
		t.wheel8();
		
		Car c = new Car();
		c.wheel4();
		
		Scooter s = new Scooter();
		s.wheel2();

}
}



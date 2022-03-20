package oops;


	
	class toyota
	{
		public void wheel4()
		{
			System.out.println("long distance");	
		}
	}

	class Trck 
	{
		public void wheel8()
		{
			System.out.println("logistics");	
		}
	}

	class bike 
	{
		public void wheel2()
		{
			System.out.println("general purpose");	
		}
	}


	

	public  class vhicle {
 
	public static void main(String[] args) {
		vhicle v = new vhicle();
		Trck t = new Trck();
		t.wheel8();
		toyota c = new toyota();
		c.wheel4();
		
		bike b = new bike();
		b.wheel2();


	}

	}



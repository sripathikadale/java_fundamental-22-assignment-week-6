package oops;

public class bikedefaultconstr {
	int num;
	String name;
	bikedefaultconstr()
	{
		System.out.println("contructor called");
	}

	public static void main(String[] args) {
		bikedefaultconstr bdc = new bikedefaultconstr();
		System.out.println(bdc.name);
		System.out.println(bdc.num);
	}

}

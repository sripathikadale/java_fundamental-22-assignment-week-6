package oops;

public class construtorchaining {
	int id;
	String name; 
	
	construtorchaining()
	{
		System.out.println("inside the constructor");
		
	}
	construtorchaining(String name)
	{
	     System.out.println("sripathi");
	}
	construtorchaining(int id)
	{
	     System.out.println("12345 ");
	}

	public static void main(String[] args) {
		 new construtorchaining("sripathi");
	
		// TODO Auto-generated method stub

	}

}

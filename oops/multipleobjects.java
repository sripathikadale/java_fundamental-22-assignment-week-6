package oops;

public class multipleobjects {
	int legs=4;
	String species= "domestic";
	public void dog()
	{
		boolean bark = false;
		if(species=="domestic")
		{
			bark=true;
		}
		System.out.println(bark);
	}
	public void cat()
	{
		System.out.println("meeeeow......");
	}
	public void cow()
	{
		System.out.println("herbivores");
	}
	public void elephant()
	{
		System.out.println("having trunks");
	}

	public static void main(String[] args) {
		multipleobjects moj = new multipleobjects();
		moj.dog();
		moj.cat();
		moj.cow();
		moj.elephant();
		// TODO Auto-generated method stub

	}

}

package oops;


	class Test
	{
	    protected void getData()
	    {
	        System.out.println("Inside hello");
	    }
	}
	class GS extends GFG
	{
	    protected void getData()
	    {
	        System.out.println("Inside GS");
	    }
	}
	  
	public class GFG
	{
		public static void main(String[] args)
	    {
	        GFG obj = new GS();
	        obj.getData();
	    }
	}


	



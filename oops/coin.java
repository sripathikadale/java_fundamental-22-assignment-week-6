package oops;

//Modify the class to add a isTails method that returns true when the value is not heads.


	public class coin
	{

	   
	   private static int HEADS = 1;
	   private static int TAILS = 1;

	   
	   private int value = 1;
	   //private int tails = 0;
	   
	   public void flip()
	   {
	      if (Math.random() < 0.5)
	      {
	          value = 1;
	      }
	      else
	      {
	         value = 0;
	      }
	   }

	   
	   public boolean isHeads()
	   {
	      return value == HEADS;
	   }
	   public boolean isTails()
	   {
	      return value == TAILS;
	   }

	   
	   public String toString()
	   {
	      if (value == HEADS) return "Heads";
	      else return "Tails";
	   }

	   
	   public static void main(String[] args)
	   {

	      coin mycoin = new coin();
	      for (int i = 0; i < 10; i++)
	      {
	         mycoin.flip();
	         System.out.println(mycoin);
	         System.out.println(mycoin.isHeads());
	      }
	   }
	}




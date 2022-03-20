package oops;

public class usingargumentconst {
	int num;
	String name;
	usingargumentconst(int a,int b)
	{
		System.out.println("contructor called");
	}

	public static void main(String[] args) {
		usingargumentconst uac = new usingargumentconst(2,7);
		System.out.println(uac.name);
		System.out.println(uac.num);

	}

}

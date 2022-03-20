package oops;

public class usingstatic {
	static String name = " ";
	static int yearofbirth;
	static int curentyear;
	
	private static int incrementAge() {
		System.out.println("inside the method");
	      int age = yearofbirth - curentyear;
		System.out.println(age);
		return age;
	}
	public static void main(String[] args) {
		usingstatic us = new usingstatic();
		String name="sripathi";
		int yearofbirth = 2000;
		int currentyear = 2022;
		
		// TODO Auto-generated method stub

	}

}

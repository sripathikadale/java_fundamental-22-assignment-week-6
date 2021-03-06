package oops;

public class Person {
	 private String name;
	   private String email;
	   private String phoneNumber;

	   
	   public Person(String theName)
	   {
	      this.name = theName;
	   }
	   Person(String s,String k)
	   {
		   this.phoneNumber = s;
		   this.email=k;
	   }
	   Person(String str,String str2,String str3)
	   {
		   this.phoneNumber = str;
		   this.email=str2;
		   this.name=str3;
	   }

	   // methods - getters
	   public String getName() { return this.name;}
	   public String getEmail() { return this.email;}
	   public String getPhoneNumber() { return this.phoneNumber;}

	   // methods - setters
	   public void setName(String theName) { this.name = theName;}
	   public void setEmail(String theEmail) {this.email = theEmail;}
	   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	   public String toString()
	   {
	      return this.name + " " + this.email + " " + this.phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args)
	   {
	      Person p1 = new Person("Sana");
	      System.out.println(p1);
	      Person p2 = new Person("Jean");
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2);
	      Person p3 = new Person("809765432","sripkhsg@gmail.in");
	      System.out.println(p3);
	      Person p4 = new Person("80973524233","kedpitty@mail.in","kadale");
	      System.out.println(p4);
	   }
	}




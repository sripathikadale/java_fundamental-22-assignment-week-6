package oops;

public class getterandsetter {
	private String firstname;
	private String lastname;
	
	

	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public static void main(String[] args) {
		getterandsetter gns = new getterandsetter();
		gns.setFirstname("sripathi");
		gns.setLastname("kadale");
		
		System.out.println(gns.getFirstname());
		System.out.println(gns.getLastname());		
		// TODO Auto-generated method stub

	}

}

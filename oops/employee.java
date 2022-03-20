package oops;

public class employee {
	int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorklocation() {
		return worklocation;
	}

	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}

	private String department;
	private String worklocation;

	public static void main(String[] args) {
		employee e = new employee();
		e.setDepartment("teaching");
		e.setId(89);
		e.setWorklocation("hyderabad");
		e.setName("sripathi");
		System.out.println(e.getDepartment());
		System.out.println(e.getId());
		System.out.println(e.getWorklocation());
		System.out.println(e.getName());


	}

}

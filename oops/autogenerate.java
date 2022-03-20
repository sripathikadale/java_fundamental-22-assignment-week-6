package oops;

public class autogenerate {
	private String create;
	private String destroy;

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	public String getDestroy() {
		return destroy;
	}

	public void setDestroy(String destroy) {
		this.destroy = destroy;
	}

	public static void main(String[] args) {
		autogenerate ag = new autogenerate();
		ag.setCreate("creating a class");
		ag.setDestroy("destroying a class");
		
		System.out.println(ag.getCreate());
		System.out.println(ag.getDestroy());
		// TODO Auto-generated method stub

	}

}

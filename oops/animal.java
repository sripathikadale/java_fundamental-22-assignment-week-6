package oops;

public class animal {
	int legs;
	int eyes;
	String type;
	String species;
	public void herbivorous()
	{
		System.out.println("eats only grass");
	}
	public void carnivorous()
	{
		System.out.println("eats only living organisms");
	}
	public void omivorous()
	{
		System.out.println("eats plants and animals");
	}
	

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public static void main(String[] args) {
		animal a = new animal();
		a.setEyes(2);
		a.setLegs(4);
		a.setSpecies("polar");
		a.setType("amphibian");
		System.out.println(a.getEyes());
		System.out.println(a.getLegs());
		System.out.println(a.getSpecies());
		System.out.println(a.getType());
		
		a. herbivorous();
		a.carnivorous();
		a.carnivorous();
		
	}

}

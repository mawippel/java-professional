package designpatterns.interfaces.lambdas;

/**
 * A normal bean 
 */
public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public String toString() {
		return species;
	}
	
}

package designpatterns.factory;

public class Fish extends Food {

	public Fish(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Fishs eaten: " + getQuantity());
	}

}

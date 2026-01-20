package abstraction;

public interface Vehicle {
	void price();
	void type();
}

class Bike implements Vehicle{

	@Override
	public void price() {
		System.out.println("H");
		
	}

	@Override
	public void type() {
		System.out.println("A");
		
	}
}

class Car implements Vehicle{

	@Override
	public void price() {
		System.out.println("Q");
		
	}

	@Override
	public void type() {
		System.out.println("P");
		
	}
}
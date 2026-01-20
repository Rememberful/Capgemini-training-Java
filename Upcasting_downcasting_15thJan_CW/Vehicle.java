package Upcasting_downcasting_15thJan_CW;

public class Vehicle {
	public void travel() {
		System.out.println("Vehicle");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		car c = new car();
		v = c;
		v.travel();
		bike b = new bike();
		v = b;
		bike b2 = (bike) v;
		b2.topspeed();
		train t = new train();
		v = t;
		train t2 = (train)t;
		t2.ticketprice();
	}
}

class car extends Vehicle{
	public void passenger() {
		System.out.println("Passenger");
	}
}

class bike extends Vehicle{
	public void topspeed() {
		System.out.println("Top speed");
	}
}

class train extends Vehicle{
	public void ticketprice() {
		System.out.println("Ticket Price");
	}
}
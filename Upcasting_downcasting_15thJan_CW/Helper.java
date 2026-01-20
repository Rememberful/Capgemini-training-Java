package Upcasting_downcasting_15thJan_CW;

public class Helper {
	
	public static void main(String[] args) {
		bike b = new bike();
		car c = new car();
		train t = new train();
		Vehicle v = t;
		getVehicle(v);
	}
	public static void getVehicle(Vehicle v) {
		if(v instanceof car) {
			car c = (car)v;
			c.passenger();
		}
		else if(v instanceof bike) {
			bike b = (bike)v;
			b.topspeed();
		}
		else {
			train t = (train)v;
			t.ticketprice();
		}
	}
}

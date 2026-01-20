package Classwork_17th_January;

public class Redmi3 extends Redmi2{
	@Override
	public void smartCamera() {
		System.out.println("Smart camera of Redmi3");
	}
	
	public static void main(String[] args) {
		Redmi3 r3 = new Redmi3();
		r3.smartCamera();
		r3.battery();
		r3.camera();
		
		Redmi2 r2 = new Redmi3();
		r2.battery();
		r2.smartCamera();
		
		
		
	}
}

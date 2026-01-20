package Classwork_14th_January;

public class HelpLaptop {
	public static question1 getLaptop() {
		return new question1();
	}

	public static question1 VerifyPrice(double price, String brand) {
		if(price<1000||price>500000) {
			System.out.println("price of laptop is invalid");
			return null;
		}
		return new question1(brand,price);
		
	}
}
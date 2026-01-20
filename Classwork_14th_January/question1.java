package Classwork_14th_January;

public class question1 {
	String brand;
	double price;
	
	public question1() {
		
	}
	
	public question1(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void compareLaptop(question1 laptop) {
		if(this.price>laptop.price) {
			System.out.println(this.brand+" is costly");
		}
		else {
			System.out.println(laptop.brand+" is costly");
		}	
	}
	
	public static void main(String[] args) {
//		question1 l1 = HelpLaptop.getLaptop();
		question1 l1 = HelpLaptop.VerifyPrice(500,"xyz");		
//		l1.brand = "HP";
//		l1.price = 45000.0;
//		question1 l2 = HelpLaptop.getLaptop();
		question1 l2 = HelpLaptop.VerifyPrice(5000,"xyz");	
//		l2.brand = "Dell";
//		l2.price = 50000.0;
		l1.compareLaptop(l2);	
	}
	
}

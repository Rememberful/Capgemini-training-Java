package Classwork_17th_January;

class JuniorDeva extends Deva {
	@Override
	public void goldloan() {
		System.out.println("JD Paid gold loan");
	}
	public void bike() {
		System.out.println("Bike is with junior deva");
	}
	
	public static void main(String[] args) {
		JuniorDeva jd = new JuniorDeva();
		jd.homeloan();
		jd.goldloan();
		jd.bike(); //-> Possible
		//Now we will UC
		Parent p = new JuniorDeva(); //can't do for Deva() as it is abstract
		p.homeloan();
		p.goldloan();	
//		p.bike() -> not possible
		Deva d = new JuniorDeva();
		d.homeloan();
		d.goldloan();
		
	}
}

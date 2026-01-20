package Classwork_19th_January;

public class Human {
	Heart heart;
	Address address;//Aggregation relation
	public Human() {
		heart = new Heart();//Composition relation
	}
	public static void main(String[] args) {
		Human human=new Human();
		human.heart.pump();
		Address address=new Address();
		human.address=address;
		human.address.location();
	}

}
class Heart{
	public void pump() {
		System.out.println("Heart is pumping");
	}
}
class Address{
	public void location() {
		System.out.println("INDIA");
	}
}
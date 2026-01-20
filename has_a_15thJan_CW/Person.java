package has_a_15thJan_CW;

//Composition 

//Has-a
public class Person {
	String name;
	PanCard panCard;
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Dinga";
		PanCard card = new PanCard();
		card.panid = "ABC123";
		card.dob = "14/04/1888";
		person.panCard = card;
		System.out.println(person.name);
		System.out.println(person.panCard.panid);
		System.out.println(person.panCard.dob);
	}
}

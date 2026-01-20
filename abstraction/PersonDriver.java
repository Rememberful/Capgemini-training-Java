package abstraction;

public class PersonDriver {
public static void main(String[] args) {
	Person p = new Person();
	Vehicle v = new Car();
	
	p.setV(v);
	p.setV(new Bike());
	
	Vehicle v2 = p.getV();
	v2.type();
	v2.price();
}
}

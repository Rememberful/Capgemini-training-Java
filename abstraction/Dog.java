package abstraction;

public class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog");
	}
	@Override
	public void color() {
		System.out.println("Barks");
	}
	
	public static void main(String[] args) {
		//Creating interface reference
		Animal a = new Dog(); //UC
		a.sound();
		a.color();
		
		//For classcastexception
//		Cat d = (Cat)a;
//		d.sound();
//		d.color();
		
		Cat c = new Cat();
		c.sound();
		c.color();
		
		Cow t = new Cow();
		t.sound();
		t.color();
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Cat");
	}
	@Override
	public void color() {
		System.out.println("Meow");
	}
}

class Cow implements Animal{
	@Override
	public void sound() {
		System.out.println("Cow");
	}
	@Override
	public void color() {
		System.out.println("Mou");
	}
}


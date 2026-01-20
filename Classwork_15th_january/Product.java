package Classwork_15th_january;

public class Product {

	String brand;
	public Product(String b) {
		this.brand=b;
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("Samsung","JIO",100000);
		m.print();
	}
}

class Mobile extends Product{
	int price;
	String sim;
	public Mobile(String b,String s,int p) {
		super(b);
		this.sim=s;
		this.price=p;
	}
	public void print() {
		System.out.println("Brand is "+brand+" having sim "+sim+" is priced at "+price);
	}


class Laptop extends Product{
	int price;
	String processor;
	public Laptop(String b,String s,int p) {
		super(b);
		this.processor=s;
		this.price=p;
	}

	public void print() {
		System.out.println("Laptop brand is "+brand+" having processor of "+processor+" is priced at "+price);
	}
}
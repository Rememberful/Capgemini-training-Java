package has_a_15thJan_CW;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine e;
	private int getid() {
		return id;
	}
	public String getcolor(String color) {
		return color;
	}
	public String getbrand(String brand) {
		return brand;
	}
	public void setid(int id) {
		this.id = id;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public void setbrand(String brand) {
		this.color = brand;
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.id(1);
		c.setbrand("BMW");
		c.setcolor("Black");
		Engine = new Engine();
		c.Engine = e1;
	}
}

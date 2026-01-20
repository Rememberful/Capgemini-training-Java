package Assignment_14th_january;

//Parent class + main class
public class Vehicle {
 String color;

 void showColor() {
     System.out.println("Color: " + color);
 }

 // main method
 public static void main(String[] args) {

     Bike bike = new Bike();
     bike.color = "Red";
     bike.brand = "Yamaha";
     bike.price = 120000;
     bike.showColor();
     bike.showBikeDetails();

     System.out.println();

     Car car = new Car();
     car.color = "Black";
     car.brand = "Toyota";
     car.price = 1500000;
     car.showColor();
     car.showCarDetails();
 }
}

//Child class: Bike
class Bike extends Vehicle {
 String brand;
 double price;

 void showBikeDetails() {
     System.out.println("Bike Brand: " + brand);
     System.out.println("Bike Price: " + price);
 }
}

//Child class: Car
class Car extends Vehicle {
 String brand;
 double price;

 void showCarDetails() {
     System.out.println("Car Brand: " + brand);
     System.out.println("Car Price: " + price);
 }
}

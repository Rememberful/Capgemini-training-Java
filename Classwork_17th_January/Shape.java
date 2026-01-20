package Classwork_17th_January;

public abstract class Shape {
    public abstract double area();

    void display() {
        System.out.println("Area is " + area());
    }

    public static void main(String[] args) {
        Shape s = new Circle(4);
        s.display();
    }
}

class Circle extends Shape {
    double r;

    Circle(double radius) {
        this.r = radius;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

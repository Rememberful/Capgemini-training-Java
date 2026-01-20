package Classwork_19th_January;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Person {
    Animal pet;   // HAS-A relationship
    Person(Animal pet) {
        this.pet = pet;
    }
    void makePetSound() {
        pet.sound();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        Person person = new Person(dog);
        person.makePetSound();
    }
}
// Abstraction using abstract class

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.start();
        Car c = new Car();
        c.start();
      
    }
}

// Inheritance: Child class acquiring properties of Parent class

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // own method
    }
}

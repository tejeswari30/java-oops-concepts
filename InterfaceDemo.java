// Abstraction using interface

interface Payment {

    void pay();   // abstract method
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();
    }
}

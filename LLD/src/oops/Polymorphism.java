package oops;

// Run-Time Polymorphism or Late Binding or Dynamic Binding or Method Overriding
class Payment{
    void processPayment(){
        System.out.println("Processing Payment in Payment class");
    }

    // Method Overloading or Early Binding or Static Binding or Compile Time Polymorphism
    void initiatePayment(int amount, String paymentMethod){
        System.out.println("Initiating payment in Payment Class");
    }

    void initiatePayment(int amount, String paymentMethod, String currency){
        System.out.println("Initiating payment in Payment Class with Currency");
    }
}

class CreditCardPayment extends Payment{
    @Override
        void processPayment(){
        System.out.println("Processing Payment in CreditCardClass class");
    }
}

class UPIPayment extends Payment{
    @Override
        void processPayment(){
        System.out.println("Processing Payment in UPIPayment class");
    }
}


public class Polymorphism {
    
}

package cohesion;

// Loose Coupling in Abstraction 
// Tight Coupling 
class CreditCardPayment {
    public void charge(double amount){
        System.out.println("Charging Credit Card: " + amount);
    }
}

class PaymentSystem{
    CreditCardPayment creditCardPayment;

    public PaymentSystem(){
        this.creditCardPayment = new CreditCardPayment();
    }

    public void processPayment(double amount){
        creditCardPayment.charge(amount);
    }

}

public class Coupling {

}

package oops;

// Payment System
interface PaymentSystem{
    void makePayment(double amount);
    void paymentStatus();
}

class CreditCardPayment implements PaymentSystem{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card!" );
    }

    @Override
    public void paymentStatus() {
        System.out.println("Payment Successful using Credit Card!");
    }
}

class UPIPayment implements PaymentSystem{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using UPI Payment!" );
    }

    @Override
    public void paymentStatus() {
        System.out.println("Payment Successful using UPI Payment!");
    }
    
}

class DebitCardPayment implements PaymentSystem{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Debit Card Payment!" );
    }

    @Override
    public void paymentStatus() {
        System.out.println("Payment Successful using Debit Card!");       
    }
    
}


abstract class BankTransaction{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void printTransactionDetails(){
        System.out.println("Transaction Details printed1");
    }
}

class NetBanking extends BankTransaction{
    @Override
    void deposit(double amount) {

    }

    @Override
    void withdraw(double amount) {

    }
}

class NEFT extends BankTransaction{
    @Override
    void deposit(double amount) {

    }

    @Override
    void withdraw(double amount) {
        
    }
}

class IMPS extends BankTransaction{

    @Override
    void deposit(double amount) {
           
    }

    @Override
    void withdraw(double amount) {
        
    }
    
}

public class Abstraction {

}



// // Abstract 
// abstract class Animal{
//     abstract void sound();
//     abstract boolean isWild();
//     void sleep(){
//         System.out.println("Sleeping...");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Bark!");
//     }

//     @Override
//     boolean isWild() {
//         return false;
//     }
// }

// // Interface
// interface Pet{
//     void play();
//     void eat();
//     void Walk();
// }

// class Cat implements Pet{

//     @Override
//     public void Walk() {
//         System.out.println("Cat is Walking");
        
//     }

//     @Override
//     public void eat() {
//         System.out.println("Cat is Eating");
//     }

//     @Override
//     public void play() {
//         System.out.println("Cat is Playing");        
//     }
    
// }


// public class Abstraction {

// }

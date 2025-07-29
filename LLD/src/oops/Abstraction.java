package oops;

// ✅ Interface - Defines a contract for all payment systems
interface PaymentSystem {
    void makePayment(double amount);
    void refundPayment(double amount);
}

// ✅ Implementation 1 - Credit Card
class CreditCardPayment implements PaymentSystem {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card!");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refund of " + amount + " successful using Credit Card!");
    }
}

// ✅ Implementation 2 - UPI
class UPIPayment implements PaymentSystem {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using UPI!");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refund of " + amount + " successful using UPI!");
    }
}

// ✅ Implementation 3 - Debit Card
class DebitCardPayment implements PaymentSystem {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made using Debit Card!");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refund of " + amount + " successful using Debit Card!");
    }
}

// ✅ Abstract Class - Defines a blueprint for all bank transactions
abstract class BankTransaction {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void printTransactionDetails() {
        System.out.println("Transaction Details printed!");
    }
}

// ✅ NetBanking Transaction
class NetBanking extends BankTransaction {
    @Override
    void deposit(double amount) {
        System.out.println("Deposited " + amount + " using Net Banking");
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawn " + amount + " using Net Banking");
    }
}

// ✅ NEFT Transaction
class NEFT extends BankTransaction {
    @Override
    void deposit(double amount) {
        System.out.println("Deposited " + amount + " using NEFT");
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawn " + amount + " using NEFT");
    }
}

// ✅ IMPS Transaction
class IMPS extends BankTransaction {
    @Override
    void deposit(double amount) {
        System.out.println("Deposited " + amount + " using IMPS");
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawn " + amount + " using IMPS");
    }
}

// ✅ Main Class
public class Abstraction {
    public static void main(String[] args) {
        PaymentSystem payment1 = new CreditCardPayment();
        payment1.makePayment(1000);
        payment1.refundPayment(500);

        BankTransaction transaction1 = new NetBanking();
        transaction1.deposit(2000);
        transaction1.withdraw(1000);

        BankTransaction transaction2 = new IMPS();
        transaction2.deposit(3000);
        transaction2.withdraw(1500);
    }
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

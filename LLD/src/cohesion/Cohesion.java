package cohesion;



// High Cohesion --> Order Class is only focus on order related operations
class OrderProcessor{

    public void processOrder(Order order){
        validateOrder(order);
        prepareOrder(order);
        saveToDatabaseHistory(order);
    }

    void validateOrder(Order order){
        System.out.println("Validating Order: " + order.getOrderId());
    }
    void prepareOrder(Order order){
        System.out.println("Preparing Order: " + order.getOrderId());
    }
    void saveToDatabaseHistory(Order order){
        System.out.println("Saving Order To Database: " + order.getOrderId());
    }
}


// Low Cohesion
class OrderProcessorLowCohesion{
    void GetConnection(){
        System.out.println("Getting database connection!");
    }

    void processOrder(Order order){
        validateOrder(order);
        prepareOrder(order);
        saveToDatabaseHistory(order);
    }

    private void validateOrder(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateOrder'");
    }

    private void prepareOrder(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepareOrder'");
    }

    private void saveToDatabaseHistory(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveToDatabaseHistory'");
    }



}


public class Cohesion{

}






// package cohesion;

// class Authentication{

//     // Not got to implement do separate class. like UserDetails, ValidatingUser, Login.
//     // public void getUserDetails(){

//     // }

//     // public void validateUser(){

//     // }

//     // public void login(){

//     // }
// }

// class SequentialCohesion{
//     public void calculateRadius(){
//         // getting radius
//     }

//     public void calculateArea(int radius){
//         // calculate radius
//     }

//     public void calculateCircumference(int radius){
//         // calculate circumference
//     }


// }



// public class Cohesion {

// }

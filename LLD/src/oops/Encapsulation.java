package oops;

class Employee{

    // Data Members
    private long empId;
    private String empName;
    private int age;
    private String address;

    // Getters And Setters
    public long getEmpId(){
        return empId;
    }

    public void getEmpId(long empId){
        this.empId = empId;
    }

    public String getEmpName() {
    return empName;
}

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // Behaviours
    void isLoggenIn(){
        System.out.println("Employee Logged In");
    }
    void isLoggedOut(){
        System.out.println("Employee Logged Out");
    }

    void printEmpId(){
        System.out.println(empId);
    }
}


public class Encapsulation{

}
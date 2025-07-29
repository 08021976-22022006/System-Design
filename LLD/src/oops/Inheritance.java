package oops;

class Person{
    String name;
    int age;

    void isEating(){
        System.out.println("Person is eating");
    }
    void isWalking(){
        System.out.println("Person is Walking");
    }
    void isSleeping(){
        System.out.println("Person is Sleeping");
    }
}

class Programmer extends Person{
    String companyName;
    String techStack;
}

class Dancer extends Person{
    String danceStyle;
    int yrsOfExp;
    
}

public class Inheritance {

}

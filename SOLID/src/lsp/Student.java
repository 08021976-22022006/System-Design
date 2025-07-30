// package lsp;

// // Liskov Substitution
// public class Student {
//     protected String name;
//     public Student(String name){
//         this.name=name;
//     }
//     public double getFees(){
//         return 5000;
//     }
// }

// Violation of LSP
// public class ScholarshipStudent extends Student{
//     public ScholarshipStudent(String name){
//         super(name);
//     }
//     @Override
//     public double getFees(){
//         throw new UnsupportedOperationException("Scholarship student don't pay");
//     }
// }



package lsp;

// Liskov Substitution
public abstract class Student {
    protected String name;
    public Student(String name){
        this.name=name;
    }
    public abstract double getFees();
}

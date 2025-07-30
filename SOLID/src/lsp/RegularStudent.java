package lsp;

public class RegularStudent extends Student{

    public RegularStudent(String name){
        super(name);
    }

    @Override
    public double getFees() {
        return 5000;
    }
    
}

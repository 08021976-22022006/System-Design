package lsp;

public class ScholarshipStudent extends Student {
    public ScholarshipStudent (String name){
        super(name);
    }

    @Override
    public double getFees() {
        return 0;
    }
}

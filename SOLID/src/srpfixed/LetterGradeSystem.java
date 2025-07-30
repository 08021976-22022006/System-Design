package srpfixed;

public class LetterGradeSystem implements GradeStrategy{

    @Override
    public String calculateGrade(double percentage) {
        if(percentage>= 90) return "A";
        else if(percentage >= 80) return "B";
        else if(percentage >= 70) return "C";
        else if(percentage >= 60) return "D";
        else if(percentage >= 50) return "E";
        else return "FAIL";
    }
    
}

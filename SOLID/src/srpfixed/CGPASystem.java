package srpfixed;

public class CGPASystem implements GradeStrategy{

    @Override
    public String calculateGrade(double percentage) {
        if(percentage>= 90) return "10";
        else if(percentage >= 80) return "9";
        else if(percentage >= 70) return "8";
        else if(percentage >= 60) return "7";
        else if(percentage >= 50) return "6";
        else return "FAIL";
    }

}

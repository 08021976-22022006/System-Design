package srpfixed;


// Use Grade Strategy
public class GradeService {
    private GradeStrategy gradeStrategy;
    public GradeService(GradeStrategy gradeStrategy){
        this.gradeStrategy=gradeStrategy;
    }
    public String getGrade(double percentage){
        return gradeStrategy.calculateGrade(percentage);
    }
}

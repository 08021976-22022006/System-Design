package srpfixed;

// Buisness Logic
public class ReportCalculator {
    public double calculatePercentage(Student student){
        int total = 0;
        for(int mark : student.getMarks()){
            total+=mark;
        }
        return total/student.getMarks().length;

    }
}

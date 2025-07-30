package srpfixed;

// Bring all thing together

// SR Principle
    // For any number student we can create Like this for creating student2, ..
    // Each class has a single responsibility and easily able to extend
    // Testing of business logic become easy
public class Main {
    public static void main(String[] args) {
        // Data Modelling 
        // Entity
        Student student1 = new Student("Poova", new int[] {95,99,100,98,96});

        // Business Logic
        ReportCalculator reportCalculator = new ReportCalculator();
        double percentage1 = reportCalculator.calculatePercentage(student1);

        // OCP --> Open And Closed Principle.
        GradeStrategy letterStrategy = new LetterGradeSystem();
        GradeStrategy cgpStrategy = new CGPASystem();
        GradeService gradeServiceLetter = new GradeService(letterStrategy);
        GradeService gradeServiceCGPA = new GradeService(cgpStrategy);
        String gradeCGPA = gradeServiceCGPA.getGrade(percentage1);
        String gradeLetter = gradeServiceLetter.getGrade(percentage1);


        // Presentation Logic
        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.printReport(student1, percentage1);
        System.out.println("CGPA: "+gradeCGPA);
        System.out.println("Grade: "+gradeLetter);

        // Persistance
        ReportSaver reportSaver = new ReportSaver();
        reportSaver.saveToFile(student1, percentage1);


    }
}

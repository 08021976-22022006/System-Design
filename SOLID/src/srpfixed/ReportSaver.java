package srpfixed;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(Student student, double percentage){
        try (FileWriter writer = new FileWriter(student.getName() + "report.txt")){
            writer.write("Name: " + student.getName() + "\n");
            writer.write("Percentage: " + percentage + "\n");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

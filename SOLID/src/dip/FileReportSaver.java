package dip;

import java.io.FileWriter;
import java.io.IOException;

public class FileReportSaver implements ReportSaver {
    public void save(String data){
        FileWriter writer;
        try {
            writer = new FileWriter("report.txt");
            writer.write(data);
            writer.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

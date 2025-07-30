package dip;

import java.io.FileWriter;
import java.io.IOException;

public class PDFReportSaver implements ReportSaver{
    public void save(String data){
        FileWriter writer;
        try {
            writer = new FileWriter("report.pdf");
            writer.write(data);
            writer.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

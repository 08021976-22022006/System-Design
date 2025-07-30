// package dip;
// import java.io.FileWriter;
// import java.io.IOException;
// DIP
// Violation
// Should not do like this

// ReportService directly depends on file system
// Hard to change to other file type(.pdf, .txt, .jpeg) due to dependency on low level module

// public class ReportService {
//     public void saveReport(String data){
//         FileWriter writer;
//         try {
//             writer = new FileWriter("report.pdf");
//             // writer = new FileWriter("report.txt");
//             writer.write(data);
//             writer.close();
//         } catch (IOException io) {
//             io.printStackTrace();
//         }
//     }
// }

package dip;

public class ReportService {
    private ReportSaver saver;
    public ReportService (ReportSaver saver){
        this.saver=saver;
    }
    public void saveReport(String data){
        saver.save(data);
    }
}

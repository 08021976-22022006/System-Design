package dip;

public class Main {
    public static void main(String[] args) {
        ReportSaver saverFile = new FileReportSaver();
        ReportSaver saverPDF = new PDFReportSaver();

        ReportService service1 = new ReportService(saverFile);
        ReportService service2 = new ReportService(saverPDF);

        service1.saveReport("This one is saving report as Text File");
        service2.saveReport("This one is saving report as PDF File");

        
        
    }
}

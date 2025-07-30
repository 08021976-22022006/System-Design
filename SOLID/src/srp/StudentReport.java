package srp;

import java.io.FileWriter;
import java.io.IOException;

// Store Student Data
// Calculate Percentage
// Print Reports
// Save Reports To A File

// Like this We Should Not Write --> This is not Single Responsibility

// Not Done Properly
// Data Modelling
// Business Logic
// UI 
// 
public class StudentReport {
    private String name;
    private int[] marks;

    public StudentReport(String name, int marks[]){
        this.name=name;
        this.marks=marks;
    }

    public double calculatePercentage(){
        int total = 0;
        for(int mark : marks){
            total+=mark;
        }
        return (double) total / marks.length;
    }

    public void printReport(){
        System.out.println("Name : "+ name);
        System.out.println("Marks: " +calculatePercentage());
    }

    public void saveReportToFile(){
        try(FileWriter writer = new FileWriter(name + "report.txt");){
            writer.write("Name "+name+"\n");
            writer.write("Percentage "+calculatePercentage()+"\n");
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }



}

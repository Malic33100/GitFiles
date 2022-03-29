
import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String Name = myScan.nextLine();

        System.out.print("Next enter your hours worked: ");
        double hours = myScan.nextDouble();

        System.out.print("Lastly, enter your hourly rate: ");
        double hourlyRate = myScan.nextDouble();

        //string hoursWorked = "Please enter your name, the hours you've worked this week, and your hourly rate, in that order:";

        double grossPay = hours*hourlyRate;
        double tax1;
    
        if (grossPay >= 599.99){
            tax1 = grossPay*.21;
        }
        else if(599.98 == grossPay & grossPay >=  300.00){
            tax1 = grossPay*.18;
        }
        else if(299.99 == grossPay && grossPay >= 100.00){
            tax1 = grossPay*.12;
        }
        else {
            tax1 = grossPay*.06;
        }
        
        double netPay = grossPay - tax1;
        
        /** 
        System.out.print("Do u want to save as a file? 1 for yes / 2 for no ");
        double FileSave = myScan.nextDouble();

        /*object summary = { Name,
        hours, hourlyRate, tax1, grossPay, netPay}; */
        
        //if (FileSave  == 1){    
            //SavetoFile();
            System.out.println("Your name is " + Name + " and you worked " +
            hours + " hours at a rate of " + hourlyRate + ". You paid " + tax1 + " in taxes, but you made " + grossPay + " before taxes."
             + " Your net pay is " + netPay);
             System.out.println("Results saved to file");
            //System.out.print(summary);
            System.out.print("Thanks for using calcPay!");
        // }
        /*
        else {
            //return summary;
            System.out.println("Your name is " + Name + " and you worked " +
            hours + " hours at a rate of " + hourlyRate + ". You paid " + tax1 + " in taxes, but you made " + grossPay + " before taxes."
             + " Your net pay is " + netPay);
        };
        */
        // close scanner object
        myScan.close();
    }

    /*
    public static SavetoFile() {
          //  save summary to file;
        PrintStream fileOut = new PrintStream("CalcPay.txt");
        };  */

}
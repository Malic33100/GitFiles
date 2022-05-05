import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/* take students name and 5 test scores
get average of test scores 
then return range average falls in grade wise

save final grade and average to output file*/

public class finalScore {
     public static void main(String[] args){
    
int testScores[] = new int[5];

int total = 0;
int average = 0;
char finalGrade;
int i = 0;
int Save;

Scanner myScan = new Scanner(System.in);
System.out.println("Hello, Please enter your first name :");

String firstName = myScan.nextLine();

System.out.println("Now enter your 5 test scores :");
 testScores[0] = myScan.nextInt();
 testScores[1] = myScan.nextInt();
 testScores[2] = myScan.nextInt();
 testScores[3] = myScan.nextInt();
 testScores[4] = myScan.nextInt();

for(i = 0;i < testScores.length; i++){
     total += testScores[i];
}
 average = total/5;

if(average >= 90){
     finalGrade = 'A';
}
else if(average >= 80){
    finalGrade = 'B';
}
else if(average >= 70){
    finalGrade = 'C';
}
else if(average >= 60){
    finalGrade = 'D';
}
else {
    finalGrade = 'F';
}

//myScan.close();

//Scanner r2 = new Scanner(System.in);
System.out.println(firstName + " do you want to save the results to a file? 1 for yes/ 2 for no");
 Save = myScan.nextInt();

if ( Save == 1 ){
    Savefile(firstName, average, finalGrade);
    System.out.println("Here are the results. You received a(n) " + finalGrade + " as your final grade for this class.");
}
else {
    System.out.println("Results were not saved. You received a(n) " + finalGrade + " as your final grade for this class.");
};

myScan.close();
}  

  public static void Savefile(String firstName, int average, char finalGrade){
        String Name = firstName;
        int Average = average;
        char FinalGrade = finalGrade;

        try {
            File myObj = new File("finalgrade.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              FileWriter myWriter = new FileWriter("finalgrade.txt");
      myWriter.write("Student name: " + Name);
      myWriter.write("Class grade is " + Average + " with a " + FinalGrade + " average.");
      myWriter.close();
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        System.out.println("This has been saved to a file sucessfully.");
}

}

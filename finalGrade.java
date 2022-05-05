import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

/* take students name and 5 test scores
get average of test scores 
then return range average falls in grade wise

save final grade and average to output file*/

public class finalGrade {
     public static void main(String[] args){
    
int testScores[] = new int[5];

int total = 0;
int average = 0;
char finalGrade;

System.out.println("Hello, Please enter your first name :");
Scanner myScan = new Scanner(System.in);
String firstName = myScan.nextline();

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
     FinalGrade = 'A';
}
else if(average >= 80){
    FinalGrade = 'B';
}
else if(average >= 70){
    FinalGrade = 'C';
}
else if(average >= 60){
    FinalGrade = 'D';
}
else {
    FinalGrade = 'F';
}

System.out.println(firstName + " do you want to save the results to a file? Y/N");
Char Save = myScan.nextChar();

if ( Save == 'Y'|| 'y'){
    Savefile(char FinalGrade, int average, String firstName);
    System.out.println("Here are the results. You received a " + FinalGrade " as your final grade for this class.");
}
else {
    System.out.println("Results were not saved. You received a " + FinalGrade " as your final grade for this class.");
};

}  

  public void Savefile(String Name, int average, char FinalGrade){
        String Name = name;
        int average = average;
        char FinalGrade = FinalGrade;

        try {
            File myObj = new File("finalgrade.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              FileWriter myWriter = new FileWriter("finalgrade.txt");
      myWriter.write("Student name: " + Name);
      myWriter.write("Class grade is " + average + " with a " + FinalGrade + " average.")
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

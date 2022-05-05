import java.util.*;

 /* user enters up to 15 values
 int Array[] = new int[15];
 
 user can enter "99999" to stop entering numbers ,
  but send error if they dont submit at least one number
  then display every value entered, and how far away it is from the average 

  */
public class DistanceFromAverage {

    public static void main(String[] args){
         int Range[] = new int[15];
        int i;
        int j = 0;
        int total = 0;
        int count = 0;
        int block = 0;
    Scanner myScan = new Scanner(System.in);
    

        System.out.println("Please enter the amount of integers you want to input. Enter 99999 if you want to stop.");
        int num= myScan.nextInt();
        int Range[] = new int[num];

        System.out.println("Enter the integers :");
        int num2 = myScan.nextInt();
        Range[num2] = num2;
        int total += num2;
        int average = total/(Range.length - 1);
        int difference;
        int m = 0;

        if(Range[0] == 0){
            System.out.println("No numbers entered. Please reload the program.");
        }
        else if(Range[0] == 99999){
            System.out.println("No numbers entered. Please reload the program.");
        }
        else if(Range[num2] = 99999){
            System.out.println("HEre are the results.");
            difference = Math.abs(average-(Range[num2]);
        }
        {
         System.out.println("Here are the results.");
        for(m = 0; m < Range.length - 1; m++){
            difference = Math.abs(average - Range[m]);
            System.out.println(difference);
            System.out.println(Range[m]);
            System.out.println(Range[0]);
            System.out.println(" The " + (m+1) + "th element of your array is " + difference + " units away from the average.");
            m++; 
        }   
        }
        /*do {
            //Range = Range[];
           
        }
        while(m < count - 1);
        */
        
        myScan.close();
    }
}
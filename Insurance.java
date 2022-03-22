import java.util.Scanner;

public class Insurance{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("What year is it?:");
        System.out.println("What year were you born?:");
         
        double decade = myScan.nextDouble();
        double birth = myScan.nextDouble();
        double Math = birth-decade;

        double Premium = (Math/10) * 20;
        System.out.println("Your premium is " + Premium);

        myScan.close();
    }
    
}
import java.util.Scanner;

    public class EvenOdd {
     public static void main(String[] args){

         Scanner myScan = new Scanner(System.in);
         System.out.println("Do you want to test a number for evenity? (1 for yes/2 for no) :");
         Double play = myScan.nextDouble();

         if(play == 1){
    System.out.println("Enter a integer please :");
         double UserInt = myScan.nextDouble();

           //double Malik = 10;
                if(UserInt%2 == 0){
                    System.out.println("Your input is even");
                }
                else {
                    System.out.println("Your ipnut is odd");
                }
                
                myScan.close();
                }
         }
         
    }
/* Write an application that asks a user to enter an integer.
     Display a statement that indicates whether the integer 
     is even or odd. Save the file as EvenOdd.java.
     */

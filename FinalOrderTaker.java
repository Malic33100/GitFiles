import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JButton;

import java.io.IOException;

//import com.sun.tools.javac.Main;

public class FinalOrderTaker{

    public static void main(String[] args){
    double Order1 = 0;
    double Order2 = 0;
    double Order3 = 0;
    double Order4 = 0;
    double Order5 = 0;
    double com = 0;
    double rate = 0;
    double Orders[] = new double[5];
    int Answer = 0;

    double totalCom = 0;
    double tax = .07;
    double taxTotal;
    int tracker = 0;

    Scanner myScan = new Scanner(System.in);
         System.out.println("Please enter the amount of each 5 orders:");
         
         do{
            double NewOrder = myScan.nextDouble();
            tracker++;
            for(int j=0; j < 5;j++){
           Orders[j] = NewOrder;

        Order1 = Orders[0];
        Order2 = Orders[1];
        Order3 = Orders[2];
        Order4 = Orders[3];
        Order5 = Orders[4];

        if(Orders[j] > 600){
       rate = .05;}
    else if(Orders[j] > 400){
        rate = .04;}
    else if(Orders[j] > 200){
        rate = .03;}
    else{
        rate = .02;}  

     com = rate * Orders[j];
     totalCom += com;
         }
        } 
        while(tracker < 5);
        
        double taxAmt = Order1 * tax;
        double taxAmt2 = Order2 * tax;
        double taxAmt3 = Order3 * tax;
        double taxAmt4 = Order4 * tax;
        double taxAmt5 = Order5 * tax;

        double total = Order1+Order2+ Order3 + Order4 + Order5;
        double average = total/5;
        taxTotal = taxAmt+ taxAmt2+taxAmt3+ taxAmt4+ taxAmt5;

          
        System.out.println("Here are the results :");
        System.out.println("Total of orders is : $" + total + " dollars");
        System.out.println("The average order cost was : $" + average + " dollars");
        System.out.println("Total commission earned : "+  totalCom);
        System.out.println("Total paid in Taxes : $" + taxTotal);
        System.out.println("Total of all orders with tax is : $" + (total + taxTotal));

        System.out.println("Do you want to save the output to a file? (1 for Yes/2 for No");
         Answer = myScan.nextInt();

        
         String Message ="Total of orders is : $" + total + " dollars";
         String Message2 = "The average order cost was : $" + average + " dollars";
         String Message3 = "Total commission earned : "+  totalCom;
         String Message4 = "Total paid in Taxes : $" + taxTotal;
         String Message5 = "Total of all orders with tax is : $" + (total + taxTotal);
        String Final = Message + Message2 + Message3 +Message4 + Message5;
        
         if(Answer == 1){ 
        log(Final);
             System.out.println("Saved to file output.txt ");
             System.out.println("Thanks for using My program.");
         }
         else{
            System.out.println("Thanks for using My program.");
         }

       myScan.close();
     }

        public static void log(String Final ){ 
            try {
               PrintWriter out = new PrintWriter(new FileWriter("output.txt", true), true);
          out.write(Final);
          out.close(); 
            }
            catch(Exception e){
                e.getStackTrace();
            }
          
        }
    




    

    
}

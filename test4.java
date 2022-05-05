import java.util.*;
import javax.swing.*;



public class test4 {

            
        final String Calc = "Calculate";
        
        JFrame f = new JFrame("Calculate");
            JButton b = new JButton(Calc);
            b.setBounds(100,100,100,40);
            f.add(b);
            f.setSize(300,400);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b.addActionListener( new ActionListener();
         
            
         f.dispose();    
         });
        
        
  
    }public void click(ActionEvent e){
        Scanner myScan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String Name = myScan.nextLine();

        System.out.print("Next enter your hours worked: ");
        double hours = myScan.nextDouble();

        System.out.print("Lastly, enter your hourly rate: ");
        double hourlyRate = myScan.nextDouble();

        double grossPay = (hourlyRate * hours);
        double tax1;
        

        if ( grossPay >= 599.99){
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
        myScan.close();

             String Action = e.getActionCommand();
             if(Action.equals("Calculate")) {
             System.out.println(Name + " you made " + grossPay + " gross pay and");
            System.out.println(" " + netPay + " in net pay. You paid "+tax1 + " In taxes and worked " + hours + " this week.");    
             }
             else{
                System.out.println("Calculate was not pressed ");
             }
    
    /* public static SavetoFile() {
            //  save summary to file;
          PrintStream fileOut = new PrintStream("CalcPay.txt");
          };  */
}
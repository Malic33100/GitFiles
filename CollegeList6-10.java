import java.rmi.dgc.Lease;
import java.util.*;

public class CollegeList {

    public void main(String[] args){
        CEmployee(4);
        Faculty(2);
        Student(7);
        Scanner myScan = new Scanner();


        public void choice(String Choice){
            System.out.println('PLease enter the desired type you want to enter :');
            System.out.println('S for Student');
            String Choice = myScan.next();
            switch(Choice){
              case 'C': CEmployee();
            case 'F': Faculty();
            case 'S': Student();
            case :'Q' System.out.println("THanks for using the school register!");
            default:"Please enter the appropriate character :";  
            }
            

            
        }
    }
}
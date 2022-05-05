import java.util.*;

public class Population {
    
    public static void main(String[] args){
         double Mexico = 128000000;
         double Increase = .0101;
        double Usa = 323000000;
         double Decrease = .0015;
         double Years = 0;

        
        do{
            Mexico = Mexico + (Mexico*Increase);
            Usa = (Usa-(Usa*Decrease));
            
            System.out.println(" Mexico current population is " + Mexico + "And the Us population is currently " + Usa + " . ");
            Years++;
        }
        while(Mexico < Usa);
            System.out.println("It will take " + Years + " Years for the population in Mexico to exceed the U.S. population. ");
        

    }
}
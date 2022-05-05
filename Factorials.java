import java.util.*;

public class Factorials{

    public static int LessThan10 = 10;
    public static int i = 1;

    public static int factorial(int a){
        if(a == 0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {

        int LessThan10 = 10;
        int i = 1;
               
               do{
                   System.out.println("The factorial of " + i + " is " + factorial(i) + " .");
                   i++;
               }
                while(i <= LessThan10);
                System.out.println("That is all the factorials for numbers 1-10 .");
        
    }
}
/* 
    display factorial for every integer value from 1 to 10. A factorial of a number 
    is the product of that number multiplied by each positive integer lower tha it. 
    i.e. 4 = 4 * 3 * 2 * 1 = 24
    */
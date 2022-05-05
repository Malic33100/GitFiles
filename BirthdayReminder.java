import java.util.*;
/* user enters up to 10 friends names and matching birthdates
check for name first then add birthdate 
produce count of number of names entered
display names
after, create loop that asks user for name or ZZZ
if name not entered, send error message and repeat
if name entered, print name and birthdate and ask again
if ZZZ terminate */

public class BirthdayReminder {

    public static void main(String[] args){
        int count = 0;
        
        
        int NumofNames = 0;
        int NumofBdays = 10;
        int i ;
        int Index;
    
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of names you want to save :");
        i = myScan.nextInt();
        
        int Birthdays[] = new int[10];
        String Names[] = new String[10];
        System.out.println("Enter the names :");
        for(int t = 0; t < i; t++){
            Names[t] = myScan.nextLine();
            System.out.println("and their birthdate in 6 digit form :");
            Birthdays[t] = myScan.nextInt();
        }

        System.out.println("There are " + i + " names saved. Enter the name or ZZZ to cancel");
        String play = myScan.nextLine();
        if(play.contains("ZZZ")){
            System.out.println("Have a good day");
        }
        else{
            if(Arrays.aslist(Names).contains(play)){
                 Index = Names.indexOf(play);
                System.out.println(Names[Index]+ " and their birthdate is " + Birthdays[Index]);
            }
            else{
                System.out.println("Enter a name to find a birthdate :");
            }
        }
        


        
    }
}
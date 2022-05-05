import java.util.*;

public class ValidatePassword {

    public static void main(String[] args){
        System.out.println("Please enter a password :");
        Scanner myScan = new Scanner(System.in);
        String myString = myScan.nextLine();
       // StringBuilder message = new StringBuilder("Test string");
        int stringLength = myString.length();
        int i;
        //char myArray[];
        char myArray[] = new char[myString.length()];
        //char myArray[] = myString.toCharArray(myString[stringLength]);

        for(i=0; i < stringLength; i++){
          if(myArray[i].isUpperCase() < 3){
            System.out.println("Password must have at least 3 uppercase letters");
        }
        else if(myArray[i].isLowerCase() < 2 ){
            System.out.println("Password must have at least 2 lowercase letters");
        }
        else if(myArray[i].isDigit() < 1){
            System.out.println("Password must have at least 1 digit");
        }
        else{
            System.out.println("Password is good!");
        }  
        }

        myScan.close();


        /* Password must have 2 uppercase 3 lowercase and 1 digit
        remprompt until correct password is met
        display corresponding message when password is wrong
        */
    }
}
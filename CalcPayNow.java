import java.util.Scanner;

class CalcPayNow {
public static void main(String[] args){

 Scanner FirstName = new Scanner(System.in);

System.out.println("Enter your first and last name:");
System.out.println("Enter your hours worked and hourly rate :");


String Malik = FirstName.nextLine();
String Mertus = FirstName.nextLine();

Double WorkHours = FirstName.nextDouble();
Double HourRate = FirstName.nextDouble();

Double check = WorkHours * HourRate; 

System.out.println("Your name is " + Malik + " " + Mertus);
System.out.println("And You make " + HourRate + " dollars an hour and you made " + check + " dollars this pay period before tax.");

FirstName.close();
}
}
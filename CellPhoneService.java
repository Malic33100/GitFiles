
    import java.util.Scanner;

    public class CellPhoneService{

        public static void main(String[] args){

            System.out.println("Enter your estimated max monthly talk minutes :");
            Scanner myScan = new Scanner(System.in);
            double talk = myScan.nextDouble();

            System.out.println("Enter your estimated most texts sent in a month :");
            double text = myScan.nextDouble();

            System.out.println("Enter your estimated most gigabytes of data used in a month :");
            double data = myScan.nextDouble();

            if(data != 0){
                if(data > 3){
                    System.out.println("You should choose plan F!");
                }
                else {
                    System.out.println("You should choose plan E!");
                }
            }
            else if(talk < 500){
                if(text != 0){
                    System.out.println("You should choose plan B!");
                }
                else{
                    System.out.println("You should choose plan A!");
                }
            }
            else {
                if(text > 100){
                    System.out.println("You should choose plan D!");
                }
                else{
                    System.out.println("You should choose plan C!");
                }
            }
            myScan.close();
        }
    }
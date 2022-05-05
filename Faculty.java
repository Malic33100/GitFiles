import java.util*;

public class Faculty {

    Bool Tenure = true;

    public void main(String[] args){
        CEmployee Faculty = new CEmployee();
        Faculty.Name();
        Faculty.Address();
        Faculty.Salary();
        Faculty.Social();
        Faculty.Department();
        Faculty.Tenure = true;

        public void Ten(Bool Tenure){
          if(Tenure){
              System.out.println("This employee has tenure.");
          }
          else{
            System.out.println("This employee has no tenure.");
          }
        }
    }
}
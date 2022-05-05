import java.util.*;

 public class CollegeEmployee {
     int salary = Math.random((100,000 - 25,000)+ 25,000);
     long SocSec = Math.random((1000 - 250)+ 250);
    String DepName = " Human resources";

    public void main(String[] args){
        Person CEmployee = new Person();
        CEmployee.Name();
        CEmployee.Address();
        CEmployee.Salary();
        CEmployee.Social();
        CEmployee.Department();

    }

    public void Salary(int salary){
        System.out.println("Employee salary :" + salary);
    }

    public void Social(long SocSec){
        System.out.println("Social security num is:" + SocSec);
    }

    public void Department(String DepName){
        System.out.println("Department is " + DepName);
    }

}

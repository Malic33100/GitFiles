import java.util.*;

public class Person {
String first = "John";
String last = "Mathews";
String address = "123 street";
int zip = 30030;
long Cell = 123231231;

    public void main(String[] args){
        Person Zeke = new Person();
        System.out.println(Zeke);
    }

    public void Name(String first, String last){
        System.out.println("First name :" + first);
        System.out.println("Last name :" + last);

    }

    public void Address(String address, int zip, long Cell){
        System.out.println("Address :" + address);
            System.out.println(zip);
            System.out.println("Contact number : " + Cell);
    }

}

import java.util.*;

public class Billing{

    //private double price = 0;
    private double tax = 0;
    //private double Orders = 0;
    private double total = 0;
    //private double coupon = 0;

    public void  Billings(double price){
        tax = price*.08;
        total = price + tax;
        System.out.println("The total with tax is :" + total);
    }

    public void Billings(double price, double Orders){
         tax = (price * Orders)*.08;
        total = (price* Orders) + tax;
        System.out.println("The total after tax is:" + total);
    }

    public void Billings(double price, double Orders, double coupon){
        tax = ((price - coupon) * Orders)*.08;
        total = ((price - coupon)* Orders) + tax;

        System.out.println("The total after tax and coupon is :" + total);
    }

    public static void main(String[] args) {
        Billings(5.5);
        Billings(5.5,25);
        Billings(5.5,25,2.2);
    }
}
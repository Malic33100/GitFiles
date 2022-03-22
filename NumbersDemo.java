public class NumbersDemo{
    public static void TwicetheNumber(int apple, int ford) {
        apple *= 2;
        ford *= 2;
        System.out.println(apple + " , " + ford);
    }

    public static void NumberplusFive(int apple, int ford) {
        apple += 5;
        ford += 5;
        System.out.println(apple + " , " + ford);
    }

    public static void NumberSquared(int apple, int ford) {
        apple ^= 2;
        ford ^= 2;
        System.out.println(apple + " , " + ford);
    }

    public static void main(String[] args){
        int apple = 3;
        int ford = 2;
        /* TwicetheNumber(apple,ford);
     NumberplusFive(apple,ford);
     NumberSquared(apple,ford); */
       TwicetheNumber(apple,ford);
       NumberplusFive(apple,ford);
       NumberSquared(apple,ford);
    }
    
}
import java.util.*;
class Complex{
    int real,imag;
}
public class q9{
    public static void main(String[] args) {
        Complex d1 = new Complex();
        Complex d2 = new Complex();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("real");
        d1.real=sc.nextInt();
        System.out.println("imag");
        d1.imag=sc.nextInt();
        System.out.println("real");
        d2.real=sc.nextInt();
        System.out.println("imag");
        d2.imag=sc.nextInt();

          System.out.println(d1.real+ "+" +d1.imag+"i");
          System.out.println(d2.real+ "+" +d1.imag+"i");
    }
}
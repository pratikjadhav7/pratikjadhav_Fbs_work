
import java.util.*;

class Product {

    int id;
    String name;
    int quantity;
    float price;

}

public class q10 {

    public static void main(String[] args) {
        Product h1 = new Product();
        Product h2 = new Product();

        Scanner sc = new Scanner(System.in);

        System.out.println("Product ID");
        h1.id = sc.nextInt();
        System.out.println("Product name");
        h1.name = sc.next();
        System.out.println("Product quantity");
        h1.quantity = sc.nextInt();
        System.out.println("Product price");
        h1.price = sc.nextFloat();

        System.out.println("Product ID");
        h2.id = sc.nextInt();
        System.out.println("Product name");
        h2.name = sc.next();
        System.out.println("Product quantity");
        h2.quantity = sc.nextInt();
        System.out.println("Product price");
        h2.price = sc.nextFloat();

        System.out.println("Product ID" + h1.id);
        System.out.println("Product name" + h1.name);
        System.out.println("Product quantity" + h1.quantity);
        System.out.println("Product price"+h1.price);
        System.out.println("Product ID" + h2.id);
        System.out.println("Product name" + h2.name);
        System.out.println("Product quantity" + h2.quantity);
        System.out.println("Product price"+h2.price);

    }
}

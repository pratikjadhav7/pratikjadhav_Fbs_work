import java.util.*;
public class q5{
    public static void main(String[] args) {
        int price;
        float dis=0;
         
        System.out.print("Enter Price:");
        Scanner sc  = new Scanner(System.in);
        price=sc.nextInt();
        
        char ch;
        System.out.println("Are You Student? (y/n) :");
        ch=sc.next().charAt(0);
        if(ch=='y'){
            if(price>500){
                dis=price*0.20f;
            }else{
                dis=price*0.10f;
            }
            System.out.printf("Discount will be:%f",dis);
        }
        if(ch=='n'){
            if(price>600){
                dis=price*0.15f;
            }else{
                System.out.println("No Discount!");
            }
            System.out.printf("Discount will be:%f",dis);
        }



    }
}
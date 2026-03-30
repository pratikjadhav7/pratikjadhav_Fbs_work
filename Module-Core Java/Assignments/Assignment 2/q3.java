import java.util.*;
public class q3{
        public static void main(String[] args) {
            int n1,n2,n3;

            System.out.print("Enter Three Numbers:");
            Scanner sc = new Scanner(System.in);
            n1=sc.nextInt();
            n2=sc.nextInt();
            n3=sc.nextInt();

            if(n1>n2){
                if(n1>n3){
                    System.out.printf("%d is greater",n1);
                }
            }
            if(n2>n1){
                if(n2>n3){
                    System.out.printf("%d is greater",n2);
                }
            }
            if(n3>n2){
                if(n3>n1){
                    System.out.printf("%d is greater",n3);
                }
            }

        }
}
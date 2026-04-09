import java.util.*;
public class q1{
    public static void main(String args[]){
        int n;
        System.out.println("Enter n to Print Armstrong Numbers:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        System.out.printf("Armstrong Numbers till %d are:",n);
        for(int i=1;i<=n;i++){
            int digit;
            int arm=0;
            int temp=i;

            while(temp>0){
                digit=temp%10;
                arm+=digit*digit*digit;
                temp/=10;
            }
            if(arm==i){
              System.out.printf("%d ",i);
        }
        }
        
    }
}
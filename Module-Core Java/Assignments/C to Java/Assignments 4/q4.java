
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n to Print Strong Num:");

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int digit;
            int temp=i;
            int sum=0;

            while(temp>0){
                digit=temp%10;
                int fact=1;
                for(int j=1;j<=digit;j++){
                    fact*=j;
                }
                sum+=fact;
                temp/=10;
            }

            if(sum==i){
                System.out.printf("%d ",i);
            }
        }
    }
}
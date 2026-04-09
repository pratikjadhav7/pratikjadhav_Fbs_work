import java.util.*;
public class q2{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n to Print Prime Numbers:");
     
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int isPrime=1;

            if(i<2){
                isPrime=0;
            }else{
                for(int j=2;j*j<=i/2;j++){
                    if(i%j==0){
                        isPrime=0;
                        break;
                    }
                }
            }
            if(isPrime==1){
               System.out.printf("%d ",i);
            }
        }
    }
}
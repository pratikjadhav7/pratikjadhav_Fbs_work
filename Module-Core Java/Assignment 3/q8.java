public class q8{
    public static void main(String[] args) {
        int n=145;
        int digit;
        int temp=n;
        int sum=0;
        while(n>0){
            digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==temp)
        System.out.println("Strong Number");
        else
        System.out.println("Not Strong Number");
    }
}
public class q5{
    public static void main(String[] args) {
        int n=153;
        int digit;
        int sum=0;
        int temp=n;

        while(n>0){
            digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(sum==temp)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
    }
}
public class q10{
    public static void main(String[] args) {
        int n=1234984453;
        int fdigit=n;
        int ldigit=n%10;
        while(fdigit>=10){
            fdigit/=10;
        }
        int sum=0;
        sum=fdigit+ldigit;
        System.out.printf("%d",sum);
    }
}
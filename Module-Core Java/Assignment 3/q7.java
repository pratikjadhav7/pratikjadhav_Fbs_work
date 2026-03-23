public class q7{
    public static void main(String[] args) {
        int n=10;
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println(+fact);
    }
}
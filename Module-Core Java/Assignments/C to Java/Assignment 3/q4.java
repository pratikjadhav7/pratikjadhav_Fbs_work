public class q4{
    public static void main(String[] args) {
        int n=101;
        int isprime=1;
        if(n<2){
            System.out.println("Not Prime");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=0;
                break;
            }
        }
        if(isprime==1)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}
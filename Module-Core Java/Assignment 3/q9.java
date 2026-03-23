public class q9{
    public static void main(String[] args) {
        int n=1221;
        int digit;
        int temp=n;
        int reversed=0;
        while(n>0){
            digit=n%10;
            reversed=(reversed*10)+digit;
            n/=10;
        }
        if(reversed==temp)
        System.out.println("palindrome");
        else
        System.out.println("Not palindrome");
    }
}
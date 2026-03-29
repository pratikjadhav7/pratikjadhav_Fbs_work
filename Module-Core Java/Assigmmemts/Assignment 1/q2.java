public class q2{
    public static void main(String[] args) {
        int n=121;
        int reversed=0;
        int digit;
        int temp=n;

        while(n>0){
            digit=n%10;
            reversed=(reversed*10)+digit;
            n/=10;
     
        }
        if(reversed==temp)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }

}
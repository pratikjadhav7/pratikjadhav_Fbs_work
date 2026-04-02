
import java.util.*;

public class q5 {

    static void isEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    static void isPrime(int n) {
        int isPrime = 1;

        if (n < 2) {
            isPrime = 0;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        if (isPrime == 1) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }

    static void isPalindrome(int n) {
        int digit;
        int reversed = 0;
        int temp = n;

        while (temp > 0) {
            digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (n == reversed) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }
    }

    static void isPosNeg(int n) {
        if (n < 0) {
            System.out.println(n + " is Negative"); 
        }else if (n == 0) {
            System.out.println(n + " is Zero"); 
        }else {
            System.out.println(n + " is Positive");
        }
    }

    static void reversenum(int n) {
        int digit;
        int reverse = 0;

        while (n > 0) {
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed Num: " + reverse);
    }

    static void sumOfDigit(int n) {
        int digit;
        int sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Sum Of Digits: " + sum);
    }

    public static void main(String[] args) {
        int choice;
        int n;

        do {
            System.out.println("\n------ Press the Following ------\n ");

            System.out.println("1. To Check Number Is Even Or Odd?");
            System.out.println("2. To Check Number Is Prime Or Not?");
            System.out.println("3. To Check Number Is Palindrome Or Not?");
            System.out.println("4. To Check Number Is Positive,Negative Or Zero?");
            System.out.println("5. To Reverse Number");
            System.out.println("6. To Sum Of Digit");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number:");
            n = sc.nextInt();

            System.out.print("Enter to Perform Following Operations:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    isEvenOdd(n);
                    break;
                case 2:
                    isPrime(n);
                    break;
                case 3:
                    isPalindrome(n);
                    break;
                case 4:
                    isPosNeg(n);
                    break;
                case 5:
                    reversenum(n);
                    break;
                case 6:
                    sumOfDigit(n);
                    break;
                case 0:
                    System.out.println("Exiting..");
                    break;
                default:
                   System.out.println("Invalid Choice");
                   break;

            }

        } while (choice != 0);
    }
}

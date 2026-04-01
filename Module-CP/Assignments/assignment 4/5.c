#include <stdio.h>
void isEvenOdd(int);
void isPrime(int);
void isPalindrome(int);
void isPosNegZ(int);
void isPrime(int);
void reverseNum(int);
void sumOfDigit(int);
int main() {
  int choice;
  int n;

  do {
    printf("\n----- Press To Perform Any Operation ------\n");

    printf("\n1. Number is Even or Odd.");
    printf("\n2. Number is Prime or Not.");
    printf("\n3. Number is Palindrome or Not.");
    printf("\n4. Number is Positive,Negative or Zero.");
    printf("\n5. To Reverse Number");
    printf("\n6. To Find Sum Of digit.");
    printf("\n0. Exit.");

    printf("\nEnter Number To Perform operation: ");
    scanf("%d", &n);

    printf("Enter Choice.");
    scanf("%d", &choice);

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
      isPosNegZ(n);
      break;
    case 5:
      reverseNum(n);
      break;
    case 6:
      sumOfDigit(n);
      break;
    case 0:
      printf("\nExiting....!");
    default:
      printf("Invalid Choice!");
    }
  } while (choice != 0);
}

void isEvenOdd(int n) {
  if (n % 2 == 0)
    printf("%d is Even!", n);
  else if (n % 2 != 0)
    printf("%d is Odd!", n);
  else
    printf("Enter Valid Num!");
}

void isPrime(int n) {
  int isPrime = 1;
  if (n < 2) {
    isPrime = 0;
  }else{
    for (int i = 2; i*i<= n; i++) {
      if (n % i == 0) {
        isPrime = 0;
        break;
      }
    }
  }
  if(isPrime)
    printf("%d Prime Number",n);
    else
    printf("%d is Not Prime Number",n);
}

void isPalindrome(int n){
    int temp=n;
    int digit;
    int reversed=0;

    while(n>0){
        digit=n%10;
        reversed=reversed*10+digit;
        n/=10;
    }
    if(reversed==temp)
    printf("Palindrome!");
    else
    printf("Not Palindrome!");
}

void isPosNegZ(int n){
    if(n==0)
    printf("%d is Zero!",n);
    else if(n<0)
    printf("%d is Negative!",n);
    else
    printf("%d is Posotive!",n);
}

void reverseNum(int n){
    int digit;
    int reversed=0;

    while(n>0){
        digit=n%10;
        reversed=reversed*10+digit;
        n/=10;
    }
    printf("Reversed Number:%d",reversed);
}

void sumOfDigit(int n){
    int digit;
    int sum=0;

    while(n>0){
        digit=n%10;
        sum+=digit;
        n/=10;
    }
    printf("Sum Of Digits:%d",sum);
}
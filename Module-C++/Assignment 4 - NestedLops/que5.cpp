#include <iostream>
using namespace std;

void isEvenOdd(int n) {
  if (n % 2 == 0)
    cout << n << " is Even Number!";
  else
    cout << n << " is Odd Number!";
}

void isPrime(int n) {
  int isPrime = 1;
  if (n < 2) {
    isPrime = 0;
  } else {
    for (int j = 2; j < n; j++) {
      if (n % j == 0) {
        isPrime = 0;
        break;
      }
    }
  }
  if (isPrime == 1)
    cout << n << " is Prime!";
  else
    cout << n << " is Not Prime!";
}

void isPalindrome(int n) {
  int digit;
  int reverse=0;
  int temp = n;

  while (temp > 0) {
    digit = temp % 10;
    reverse = reverse * 10 + digit;
    temp /= 10;
  }
  if (n == reverse)
    cout << n << " is Palindrome!";
  else
    cout << n << " is Not Palindrome!";
}

void isPosNeg(int n) {
  if (n < 0)
    cout << "Number is Negative";
  else if (n > 0)
    cout << "Number is Positive";
  else
    cout << "It Is Zero!";
}

void toReverse(int n) {
  int digit;
  int reverse = 0;

  while (n > 0) {
    digit = n % 10;
    reverse = reverse * 10 + digit;
    n /= 10;
  }
  cout << "Reversed Number: " << reverse;
}

void sumOfDigit(int n) {
  int digit;
  int sum = 0;

  while (n > 0) {
    digit = n % 10;
    sum += digit;
    n /= 10;
  }
  cout << "Sum Of Digits: " << sum;
}
int main() {
  int choice;
  int num;

  do {

    cout << "\n-------Select Option to Perform Following Operation----";
    cout << "\n1. To Check Even/Odd";
    cout << "\n2. To Check Prime or Not";
    cout << "\n3. To Check Palindrome or Not";
    cout << "\n4. To Check  Number Pos/Neg";
    cout << "\n5. To Reverse Number";
    cout << "\n6. To Sum Of Digit";
    cout << "\n0. Exit";

    cout << "\nEnter Number to Perform Operation:";
    cin >> num;

    cout << "\n Enter Choice: ";
    cin >> choice;

    switch (choice) {
    case 1:
      isEvenOdd(num);
      break;
    case 2:
      isPrime(num);
      break;
    case 3:
      isPalindrome(num);
      break;
    case 4:
      isPosNeg(num);
      break;
    case 5:
      toReverse(num);
      break;
    case 6:
      sumOfDigit(num);
      break;
    case 0:
      cout << "---- Thank-You -----";
    default:
      cout << "Enter Valid Choice!";
    }
  } while (choice != 0);
}
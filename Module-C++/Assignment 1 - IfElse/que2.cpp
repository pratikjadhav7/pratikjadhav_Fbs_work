#include <iostream>
using namespace std;

int main() {
  int num;
  int digit;
  int reversed = 0;

  cout << "Enter Number: ";
  cin >> num;
  int temp = num;

  while (temp > 0) {
    digit = temp % 10;
    reversed = reversed * 10 + digit;
    temp /= 10;
  }
  if (num == reversed)
    cout << "Plaindrome!";
  else
    cout << "Not Palindrome!";
}
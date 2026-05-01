#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Enter n to print Strong Numbers: ";
  cin >> n;

  cout << "Strong Numbers: ";

  for (int i = 1; i <= n; i++) {
    int digit;
    int temp = i;
    int sum = 0;

    while (temp > 0) {
      digit = temp % 10;

      int fact = 1;

      for (int j = 1; j <= digit; j++) {
        fact *= j;
      }
      sum+=fact;
      temp/=10;
    }
    if(i==sum){
        cout<<i<<" ";
    }
  }
}
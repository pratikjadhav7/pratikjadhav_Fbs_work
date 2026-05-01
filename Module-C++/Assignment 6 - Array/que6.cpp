#include <iostream>
using namespace std;

int main() {

  int sum = 0;
  int s;
  cout << "Enter Size Of Array: ";
  cin >> s;

  int arr[s];

  cout << "Enter Elements in ARray: ";
  for (int i = 0; i < s; i++) {
    cin >> arr[i];
  }

  cout << "Array: ";
  for (int i = 0; i < s; i++) {
    cout << arr[i] << " ";
  }

  cout << "Prime Numbers: ";
  for (int i = 0; i < s; i++) {
    int isPrime = 1;

    if (arr[i] < 2) {
      isPrime = 0;
    } else {
      for (int j = 2; j < arr[i]; j++) {
        if (arr[i] % j == 0) {
          isPrime = 0;
          break;
        }
      }
    }
    if (isPrime == 1) {
      cout<<arr[i]<<" ";
    }
  }
}
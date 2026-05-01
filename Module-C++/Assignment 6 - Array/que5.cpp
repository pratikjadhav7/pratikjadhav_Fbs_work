#include <iostream>
using namespace std;

int main() {

    int sum=0;
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

  cout<<"\nAlternate Elm: ";
  for(int i=0;i<s;i+=2){
    cout<<arr[i]<<" ";
  }
}
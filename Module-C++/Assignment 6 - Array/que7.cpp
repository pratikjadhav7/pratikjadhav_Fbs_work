#include <iostream>
using namespace std;

int main() {

  int sum = 0;
  int s1,s2;
  cout << "Enter Size Of Array-1: ";
  cin >> s1;

  int arr1[s1];

  cout << "Enter Elements in ARray: ";
  for (int i = 0; i < s1; i++) {
    cin >> arr1[i];
  }

  cout << "Array: ";
  for (int i = 0; i < s1; i++) {
    cout << arr1[i] << " ";
  }
  cout << "\nEnter Size Of Array-2: ";
  cin >> s2;

  int arr2[s2];

  cout << "Enter Elements in ARray: ";
  for (int i = 0; i < s2; i++) {
    cin >> arr2[i];
  }

  cout << "Array: ";
  for (int i = 0; i < s2; i++) {
    cout << arr2[i] << " ";
  }

  int maxSize=(s1>s2)?s1:s2;
  int arr3[maxSize];

  for(int i=0;i<maxSize;i++){
    arr3[i]=arr2[i]+arr1[i];
  }

  cout<<"Sum of elms of Array 1 & Array 2";
  for(int i=0;i<maxSize;i++){
     cout<<arr3[i]<<" ";
  }


}
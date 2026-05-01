#include <iostream>
using namespace std;

int main() {

    int sum=0;
  int s;
  cout << "Enter Size Of Array: ";
  cin >> s;

  int arr[s];

  cout << "\nEnter Elements in ARray: ";
  for (int i = 0; i < s; i++) {
    cin >> arr[i];
  }

  cout << "Array: ";
  for (int i = 0; i < s; i++) {
    cout << arr[i] << " ";
  }

  cout<<"Even Numbers: ";
  for(int i=0;i<s;i++){
    if(arr[i]%2==0){
        cout<<arr[i]<<" ";
    }
  }
  cout<<"\nOdd Numbers: ";
  for(int i=0;i<s;i++){
    if(arr[i]%2!=0){
        cout<<arr[i]<<" ";
    }
  }
}
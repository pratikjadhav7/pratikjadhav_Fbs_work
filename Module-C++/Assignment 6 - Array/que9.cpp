#include <iostream>
using namespace std;

int main() {

  int sum = 0;
  int s;
  cout << "Enter Size Of Array-1: ";
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
 
  int start=0;
  int end=s-1;

  while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;

    start++;
    end--;
  }

  cout<<"Reversed Array: ";

  for(int elm:arr){
    cout<<elm<<" ";
  }
}
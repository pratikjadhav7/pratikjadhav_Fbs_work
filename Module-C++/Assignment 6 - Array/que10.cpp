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

  for(int i=0;i<s;i++){
    for(int j=0;j<s-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
  }

  cout<<"\nSorted Array: ";
  for(int elm:arr){
      cout<<elm<<" ";
  }
}
#include <iostream>
using namespace std;

int main() {
  int s;
  int found=0;
  int n;
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

  cout<<"Enter Number to Find: ";
  cin>>n;

  for(int i=0;i<s;i++){
    if(arr[i]==n){
        found=1;
        break;
    }
  }
  if(found==1)
    cout<<n<<" Found!";
    else
    cout<<n<<"Not Found!";
  

}
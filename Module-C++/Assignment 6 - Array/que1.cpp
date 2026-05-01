#include<iostream>
using namespace std;

int main(){
    int s;
    cout<<"Enter Size Of Array: ";
    cin>>s;

    int arr[s];
    
    cout<<"Enter Elements in ARray: ";
    for(int i=0;i<s;i++){
        cin>>arr[i];
    }
    
    cout<<"Array: ";
    for(int i=0;i<s;i++){
        cout<<arr[i]<<" ";
    }

    int min=arr[0];
    int max=arr[0];

    for(int i=0;i<s;i++){
        if(min>arr[i]){
            min=arr[i];
        }
        if(max<arr[i]){
            max=arr[i];
        }
    }
    cout<<"\nMAX: "<<max;
    cout<<"\nMIN: "<<min;
}
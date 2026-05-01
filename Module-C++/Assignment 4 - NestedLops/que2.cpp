#include<iostream>
using namespace std;

int main(){
    int n; 
    cout<<"Enter n to Print Armstrong Numbers: ";
    cin>>n;

    for(int i=1;i<=n;i++){
        int temp=i;
        int digit;
        int arm=0;

        while(temp>0){
            digit=temp%10;
            arm+=digit*digit*digit;
            temp/=10;
        }
        if(i==arm){
            cout<<i<<" ";
        }
    }
}
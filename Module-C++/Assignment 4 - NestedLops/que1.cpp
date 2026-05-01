#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter n to Print Prime Numbers";
    cin>>n;

    cout<<"Prime Numbers: ";

    for(int i=1;i<=n;i++){
        int isPrime=1;

        if(n<2){
            isPrime=0;
        }else{
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=0;
                    break;
                }
            }
        }
        if(isPrime==1){
            cout<<i<<" ";
        }
    }
}
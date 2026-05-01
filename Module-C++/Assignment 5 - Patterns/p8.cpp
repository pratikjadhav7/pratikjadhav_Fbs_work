#include<iostream>
using namespace std;

int main(){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==1||j==1||i==5||j==5||i+j==4||i+j==6||i+j==8){
                cout<<"* ";
            }else{
                cout<<"  ";
            }
        }
        cout<<"\n";
    }
}
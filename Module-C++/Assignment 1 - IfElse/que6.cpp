#include<iostream>
using namespace std ;

int main(){
    char ch;

    cout<<"Enter Char: ";
    cin>>ch;

    if(ch>='a' && ch<='z')
    cout<<"LowerCase!";
    else
    cout<<"UpperCase!";
}
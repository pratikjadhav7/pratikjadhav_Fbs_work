#include<iostream>
#include<string>
using namespace std;

int main(){
    string s;
    cout<<"Enter String:";
    getline(cin,s);


    cout<<"Alternate chars: ";
    for(int i=0;s[i]!='\0';i+=2){
       cout<<s[i];
    }
}
#include<iostream>
using namespace std;

int main(){
    string s;
    
    cout<<"Enter String:";
    getline(cin,s);

    int index;
    cout<<"Enter indec to remove char:";
    cin>>index;
    
    for(int i=index;s[i]!='\0';i++){
       s[i]=s[i+1];
    }
     cout<<"Updated String: "<<s;
    
}
#include<iostream>
using namespace std;

int main(){
    string s;
    
    cout<<"Enter String:";
    getline(cin,s);

    for(int i=0;s[i]!='\0';i++){
       if(s[i]==' '){
        s[i]='$';
       }
    }
     cout<<"Updated String: "<<s;
    
}
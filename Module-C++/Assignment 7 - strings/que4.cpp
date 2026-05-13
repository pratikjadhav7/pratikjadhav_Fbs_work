#include<iostream>
#include<string>
using namespace std;

int main(){
    string s;
    string s1;
    
    cout<<"Enter String:";
    getline(cin,s);

    s1=s;

    int len = s.length();

    s1[0]=s[len-1];
    s1[len-1]=s[0];
    
     cout<<"After Swaping 1st and last char: "<<s1;
    
}
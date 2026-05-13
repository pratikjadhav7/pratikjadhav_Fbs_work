#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    string s;
    cout<<"Enter String:";
    getline(cin,s);

    string s1;

    s1=s;

    reverse(s.begin(),s.end());

    if(s1.compare(s)==0){
        cout<<"Palindrome!";
    }else{
        cout<<"Not Palindrome!";
    }

}
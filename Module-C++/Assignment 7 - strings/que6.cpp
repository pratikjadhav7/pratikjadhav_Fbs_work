#include<iostream>
using namespace std;

int main(){
    string vowels="AEIOUaeiou";
 
    int count=0;

    string s;
    cout<<"Enter String:";
    getline(cin,s);

    for(int i=0;s[i]!='\0';i++){
       if(vowels.find(s[i])!= string::npos){
            count++;
       }
    }
     cout<<"Number of Vowels: "<<count;
    
}
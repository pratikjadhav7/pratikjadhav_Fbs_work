#include<iostream>
using namespace std;

int main(){
    string s;
    int found=0;
    cout<<"Enter String:";
    getline(cin,s);
    
    char ch;
    cout<<"Enter Char to find: ";
    cin>>ch;

    for(int i=0;s[i]!='\0';i++){
       if(s[i]==ch){
        found=1;
       }
    }
    if(found==1){
        cout<<ch<<" is Present";
    }else{
        cout<<ch<<" is not Present!";
    }
    
}
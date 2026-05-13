#include<iostream>
#include<string>
using namespace std;

int main(){
    string s1;
    cout<<"Enter String:";
    getline(cin,s1);
   
    string s2;
    cout<<"Enter String:";
    getline(cin,s2);

    int len1=0;
    int len2=0;

    for(int i=0;s1[i]!='\0';i++){
        len1++;
    }

    for(int i=0;s2[i]!='\0';i++){
        len2++;
    }

    if(len1>len2)
    cout<<"String 1 is larger";
    else if(len2>len1)
    cout<<"String 2 is larger";
    else
    cout<<"Both are Equal!";

   
}
#include<iostream>
#include<string>
using namespace std;

int main(){
    string s;
    cout<<"Enter String:";
    getline(cin,s);

    int size = s.size();

    cout<<"Number of Words: "<<size;
}
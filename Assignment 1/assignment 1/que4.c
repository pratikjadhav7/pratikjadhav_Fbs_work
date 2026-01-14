#include<stdio.h>
int main(){
    char ch = 'b';
    if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u'){
        printf("'%c' is vowel",ch);
    }else{
        printf("'%c' is consonant",ch);
    }
}
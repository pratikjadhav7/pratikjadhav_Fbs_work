#include<stdio.h>
#include<string.h>
int main(){
    char str [100]="mada";
    char temp [100];
    strcpy(temp,str);
    strrev(str);
    int res= strcmp(str,temp);
    if(res==0)
    printf("Palindrome!");
else
    printf("Not Palindrome!");
}
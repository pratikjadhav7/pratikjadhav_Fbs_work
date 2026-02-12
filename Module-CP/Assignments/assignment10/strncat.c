#include<stdio.h>
#include<string.h>
int main(){
    char s[]="Pratik";
    char s1[]="Jadhav";
    strncat(s,s1,2);
    printf("%s",s);
}
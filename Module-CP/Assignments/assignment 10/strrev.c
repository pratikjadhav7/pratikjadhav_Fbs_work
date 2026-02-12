#include<stdio.h>
#include<string.h>
int main(){
    char str[]="Pop";
    char temp [10];
    strcpy(temp,str);
    strrev(str);
    int res=strcmp(temp,str);
    if(res==0)
    printf("PAlindrome");
    else
    printf("Not PLaindrome");
    
}
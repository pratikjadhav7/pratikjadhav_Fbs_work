#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    scanf("%s",str);
    char temp[100];
    strcpy(temp,str);
    strrev(str);
    int res=strcmp(temp,str);
    if(res==0)
    printf("Plaindrome");
    else
    printf("Not Plaindrome");

}
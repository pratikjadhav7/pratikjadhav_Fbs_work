#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    scanf("%s",str);
    char str1[100];
    strcpy(str1,str);
    printf("str1:%s",str1);
    
}
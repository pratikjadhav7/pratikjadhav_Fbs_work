#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = (strlen(str))-1;
    printf("%d words are present in String",len);
}
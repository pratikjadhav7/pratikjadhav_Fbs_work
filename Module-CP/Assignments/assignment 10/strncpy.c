#include<stdio.h>
#include <string.h>
int main(){
    char str[]="Pratik";
    char str1[50];
    strncpy(str1,str,5);
    printf("%s",str1);
}
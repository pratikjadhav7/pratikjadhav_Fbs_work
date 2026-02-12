#include<stdio.h>
#include<string.h>
int main(){
    char str[10];
    memset(str,'A',5);
    str[5]='\0';
    printf("%s", str);
}

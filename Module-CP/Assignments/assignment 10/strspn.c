#include<stdio.h>
#include<string.h>
int main(){
    char str[]="abcde123";
    printf("%lu", strspn(str,"abcde"));
}

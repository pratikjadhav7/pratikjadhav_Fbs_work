#include<stdio.h>
#include<string.h>
int main(){
    char str[]="abc123";
    printf("%lu", strcspn(str,"123"));
}

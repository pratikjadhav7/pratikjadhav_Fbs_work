#include<stdio.h>
#include<string.h>
int main(){
    char str[]="Hello";
    printf("%s", memchr(str,'l',5));
}

#include<stdio.h>
#include<string.h>
int main(){
    char str[]="12345";
    memmove(str+2, str, 3);
    printf("%s", str);
}

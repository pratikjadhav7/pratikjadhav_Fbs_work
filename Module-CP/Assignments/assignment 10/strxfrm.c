#include<stdio.h>
#include<string.h>
int main(){
    char src[]="abc";
    char dest[20];
    strxfrm(dest, src, 20);
    printf("%s", dest);
}

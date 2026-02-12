#include<stdio.h>
#include<string.h>
int main(){
    char str[]="A,B,C";
    char *p = strtok(str,",");
    while(p){
        printf("%s\n", p);
        p=strtok(NULL,",");
    }
}

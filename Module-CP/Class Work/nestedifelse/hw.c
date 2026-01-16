#include<stdio.h>
int main(){
    int am;
    printf("Enter the Ammount:");
    scanf("%d",&am);
    int c500=am/500;
        printf("%d notes of 500 are required",c500);
    int c200=am/200;
        printf("%d notes of 200 are required",c200);
    int c100=am/100;
        printf("%d notes of 100 are required",c100);
    int c50=am/50;
        printf("%d notes of 50 are required",c50);
}
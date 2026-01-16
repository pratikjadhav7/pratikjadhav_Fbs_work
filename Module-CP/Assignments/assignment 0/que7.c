#include<stdio.h>
int main(){
    int mins = 3004;
    int hrs = mins/10;
    int hr = hrs/60;
    int min = mins%10;
    printf("%d hours and %d mins",hr,min);

}
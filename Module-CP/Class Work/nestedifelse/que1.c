#include<stdio.h>

int main(){
    int a = 10, b = 20, c = 30;
    if (a > b) {
        if (a > c) {
            printf("a is greater");
        }
    }
    if (b > a) {
        if (b > c) {
            printf("b is greater");
        }
    }
    if (c > a) {
        if (c > b) {
            printf("c is greater");
        }
    }

    return 0;
}

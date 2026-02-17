#include <stdio.h>
int isP( int*,int*,int*);
int main() {
    int n = 7;
    int i = 2;
    int isPrime = 1; 
    isP(&n,&i,&isPrime);

   
}
int isP(int *n,int *i,int *isPrime){
     while (*i < *n) {
        if (*n % *i == 0) {
            *isPrime = 0;
            break;
        }
        (*i)++;
    }

    if (*isPrime)
        printf("%d is Prime\n", *n);
    else
        printf("%d is not Prime\n",*n);

    return 0;
}

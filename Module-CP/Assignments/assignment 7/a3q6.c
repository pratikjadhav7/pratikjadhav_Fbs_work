#include <stdio.h>
int isPerfect(int*,int*);
int main() {
    int n = 28;
    int sum = 0;
    isPerfect(&n, &sum);
}
int isPerfect(int *n,int *sum){
        for (int i = 1; i <= *n / 2; i++) {
        if (*n % i == 0) {
            (*sum) += i;
        }
    }
    
    if (*sum == *n)
        printf("%d is a Perfect number\n", *n);
    else
        printf("%d is not a Perfect number\n", *n);

    return 0;
}
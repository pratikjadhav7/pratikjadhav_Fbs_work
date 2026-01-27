#include <stdio.h>

int main() {
    int n = 7;
    int i = 2;
    int isPrime = 1; 

    while (i < n) {
        if (n % i == 0) {
            isPrime = 0;
            break;
        }
        i++;
    }

    if (isPrime)
        printf("%d is Prime\n", n);
    else
        printf("%d is not Prime\n", n);

    return 0;
}

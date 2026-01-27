#include <stdio.h>

int main() {
    int n = 12345;
    int first, last, temp;

    last = n % 10;

    temp = n;
    while (temp >= 10) {
        temp = temp / 10;
    }
    first = temp;

    printf("Sum of first and last digit = %d\n", first + last);

    return 0;
}

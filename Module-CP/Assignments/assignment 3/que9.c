#include <stdio.h>

int main() {
    int n = 121, num, reversed = 0, remainder;

    num = n; 

    while (n > 0) {
        remainder = n % 10;
        reversed = reversed * 10 + remainder;
        n = n / 10;
    }

    if (num == reversed)
        printf("%d is a Palindrome number\n", num);
    else
        printf("%d is not a Palindrome number\n", num);

    return 0;
}

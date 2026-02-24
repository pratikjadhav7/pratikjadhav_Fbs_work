#include <stdio.h>

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin); // read input with spaces

    int count = 0; // tracks position for next non-space char

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] != ' ') {
            str[count++] = str[i]; // keep non-space char
        }
    }
    str[count] = '\0'; // terminate new string

    printf("String without spaces: %s\n", str);
    return 0;
}
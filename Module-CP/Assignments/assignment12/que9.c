#include <stdio.h>

int main() {
    char str1[100], str2[100];
    int len1 = 0, len2 = 0;
    printf("Enter first string: ");
    fgets(str1, sizeof(str1), stdin);
    printf("Enter second string: ");
    fgets(str2, sizeof(str2), stdin);
    for(int i=0;str1[i]!='\0'&&str1[i]!='\n';i++) {
        len1++;
    }
    for(int i=0;str2[i]!='\0'&&str2[i]!='\n'; i++) {
        len2++;
    }

    if(len1 > len2) {
        printf("Larger string: %s", str1);
    }
    else if(len2 > len1) {
        printf("Larger string: %s", str2);
    }
    else {
        printf("Both strings are equal in length");
    }
}

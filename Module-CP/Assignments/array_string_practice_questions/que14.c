#include <stdio.h>

int main() {
    int arr1[] = {1, 2, 3};
    int arr2[] = {3, 4, 5};

    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    int unionArr[size1 + size2];
    int k = 0;
    // Add all elements from arr1
    for (int i = 0; i < size1; i++) {
        unionArr[k++] = arr1[i];
    }
   // Add elements from arr2 only if they are not already in unionArr
    for (int i = 0; i < size2; i++) {
        int found = 0;
        for (int j = 0; j < size1; j++) {
            if (arr2[i] == arr1[j]) {
                found = 1;
                break;
            }
        }
        if (!found) {
            unionArr[k++] = arr2[i];
        }
    }
    printf("Union: ");
    for (int i = 0; i < k; i++) {
        printf("%d ", unionArr[i]);
    }
    printf("\n");

    return 0;
}
#include <stdio.h>

int main() {
    int s;
    printf("Enter the size of Array: ");
    scanf("%d", &s);
    int n = s + 1;  // since one number is missing
    int arr[s];
    printf("Enter array elements:\n");
    for (int i = 0; i < s; i++) {
        scanf("%d", &arr[i]);
    }
    int expected_sum = n * (n + 1) / 2;
    int actual_sum = 0;
    for (int i = 0; i < s; i++) {
        actual_sum += arr[i];
    }
    int missing = expected_sum - actual_sum;
    printf("Missing number is: %d\n", missing);
    return 0;
}
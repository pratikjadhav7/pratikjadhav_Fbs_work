#include <stdio.h>
int main() {
  int n;
  printf("Enter N to Print Prime Numbers:");
  scanf("%d", &n);

  printf("Prime Numbers till %d are: ", n);
  for (int i = 1; i <= n; i++) {
    int isPrime = 1;

    if (i < 2) {
      isPrime = 0;
    } else {
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          isPrime = 0;
          break;
        }
      }
    }
    if(isPrime)
    printf("%d ", i);
  }
}
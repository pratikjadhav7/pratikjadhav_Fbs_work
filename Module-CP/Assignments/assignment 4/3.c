#include <stdio.h>

int main() {
  int n;
  printf("Enter n: ");
  scanf("%d", &n);

  printf("Perfect numbers from 1 to %d are:\n", n);

  for (int i = 1; i <= n; i++) {
    int sum = 0;

    for (int j = 1; j <= i / 2; j++) {
      if (i % j == 0) {
        sum += j;
      }
    }

    if (sum == i && i != 0) {
      printf("%d ", i);
    }
  }

  return 0;
}
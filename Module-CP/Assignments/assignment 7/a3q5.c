#include <stdio.h>
#include <math.h>
int isArmstrong(int* ,int* ,int* ,int*);
int main() {
    int n = 153;
    int num = n;
    int sum = 0;
    int remainder;
    isArmstrong(&n,&num,&sum,&remainder);
   
}
int isArmstrong(int* n,int *num,int *sum,int *remainder){
     while (*n > 0) {
       * remainder = (*n) % 10;
        *sum += (*remainder) * (*remainder) * (*remainder);
       (*n) /= 10;
    }

    if (*sum == *num)
        printf("%d is an Armstrong number\n", *num);
    else
        printf("%d is not an Armstrong number\n", *num);

    return 0;
}
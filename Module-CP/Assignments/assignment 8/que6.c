#include<stdio.h>

int main(){
    int s;
    printf("Enter the size of Array: ");
    scanf("%d",&s);

    int arr[s];
    printf("Enter Elements:\n");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }

    printf("Prime numbers in array:\n");

    for(int i=0;i<s;i++){
        int num = arr[i];
        int isPrime = 1;

        if(num < 2)
            isPrime = 0;
        else{
            for(int j=2; j*j<=num; j++){
                if(num % j == 0){
                    isPrime = 0;
                    break;
                }
            }
        }

        if(isPrime == 1)
            printf("%d ", num);
    }

    return 0;
}

#include<stdio.h>
int main(){
    int start,end;
    int sum=0;
    printf("Enter the Range:");
    scanf("%d",&start);
    scanf("%d",&end);

    for(int i=start;i<=end;i++){
   int isPrime=1;
        if(i<=1){
            isPrime=0;
        }
         else{ 
            for(int j=2;j*j<=i;j++){
            if(i%j==0){
                isPrime=0;
                break;
            }
        }
      }
        if(isPrime==1){
            sum+=i;
        }
    }
    printf("\nSum of Prime Numbers in given Range:%d",sum);
}
#include<stdio.h>
int main(){
    int n;
    printf("Enter n to Print Armstrong Numbers:");
    scanf("%d",&n);

    
    printf("\nTotal Armstrong Numbers till %d are :",n);
    for(int i=1;i<=n;i++){
    int digit;
    int arm=0;
    int temp=i;

        while(temp>0){
            digit=temp%10;
            arm+=digit*digit*digit;
            temp/=10;
        }
        if(arm==i){
          printf("%d ",arm);
        }
    }

}
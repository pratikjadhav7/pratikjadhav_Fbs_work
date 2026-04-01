#include<stdio.h>
int main(){
    int n;
    printf("Enter n to print Strong Numbers:");
    scanf("%d",&n);

    printf("Strong numbers till %d are: ",n);
    for(int i=1;i<=n;i++){
        int digit;
        int sum=0;
        int temp=i;

        while(temp>0){
            digit=temp%10;
            int fact=1;
            for(int j=1;j<=digit;j++){
                fact*=j;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==i){
            printf("%d ",i);
        }
    }
}
#include<stdio.h>
int main(){
    int s1,s2,s3;
    printf("Enter 1st side of Triangle:");
    scanf("%d",&s1);
    printf("Enter 2nd side of Triangle:");
    scanf("%d",&s2);
    printf("Enter 3rd side of Triangle:");
    scanf("%d",&s3);
    if(s1==s2 && s2==s3){
        printf("Triangle is Equilateral as well as Isoscales");
    }
    else{
        if(s1==s2 ||  s2==s3 || s3==s1 ){
            printf("Triangle is Isoscales");
        }else{
            printf("Triangle is Scalen");
        }
    }

}
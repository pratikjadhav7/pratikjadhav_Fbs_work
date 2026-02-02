#include<stdio.h>
int isTriangle(int,int,int);
int main(){
    int s1,s2,s3;
    printf("Enter 1st side:");
    scanf("%d",&s1);
    printf("Enter 2nd side:");
    scanf("%d",&s2);
    printf("Enter 3rd side:");
    scanf("%d",&s3);
   int res= isTriangle(s1,s2,s3);
   if(res==1){
      printf("Triangle is Isosceles.");
   }else {
        printf("Triangle is Scalene");
   }
    

}
int isTriangle(int s1,int s2,int s3){
    if(s1==s2 && s2==s3 && s1==s3){
        printf("Triangle is Equilateral as well as Isosceles");
    }
    else{
        if(s1==s2 || s2==s3 || s1==s3){
          return 1;
        }else{
           return 0;
        }
    }
}
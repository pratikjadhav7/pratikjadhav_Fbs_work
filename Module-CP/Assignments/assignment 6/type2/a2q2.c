#include<stdio.h>
int isTriangle();
int main(){
    int res=isTriangle();
    if(res==1)
       printf("Equlilateral");
    else if (res==2)
    printf("Isoscales");
     else
      printf("Scalene");
    return 0;
}
int isTriangle(){
        int s1,s2,s3;
    printf("Enter 1st side:");
    scanf("%d",&s1);
    printf("Enter 2nd side:");
    scanf("%d",&s2);
    printf("Enter 3rd side:");
    scanf("%d",&s3);
    if(s1==s2 && s2==s3 && s1==s3){
        return 1;
    }
    else{
        if(s1==s2 || s2==s3 || s1==s3){
            return 2;
        }else{
            return 3;
        }
    }
}
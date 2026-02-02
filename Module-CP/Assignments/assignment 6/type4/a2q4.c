#include<stdio.h>
int isPass(int);
int main(){
     int marks;
    printf("Enter your marks:");
    scanf("%d",&marks);
   int res=isPass(marks);
   if(res==1)
   printf("Distinction");
   else if(res==2)
   printf("First Class");
   else if(res==3)
   printf("Second class");
   else if(res==4)
   printf("Pass Class");
   else
    printf("Fail");

}
int isPass(int marks){
    if(marks>=75)
        return 1;
    else if(marks<=75 && marks>=65)
            return 2;
    else if(marks<=65 && marks>=55)
            return 3;
    else if(marks<=55 && marks>=40)
            return 4;
    else if(marks<40)
            return 0;
}
            
        
    

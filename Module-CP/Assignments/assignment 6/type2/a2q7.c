#include<stdio.h>
int isChild();
int main(){
   int res= isChild();
   if(res==1)
   printf("Seinor");
   else if (res==2)
   printf("Child");
   else if(res==3)
   printf("Teenager");
   else
   printf("Adult");
 

}

int isChild(){
    int age;
    printf("Enter your age:");
    scanf("%d",&age);
    if(age>60)
        return 1;
    else if(age<12)
            return 2;
    else if(age>=12 && age<=19)
            return 3;
    else
            return 4;
            
        
    
}
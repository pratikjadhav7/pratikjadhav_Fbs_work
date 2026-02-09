
#include<stdio.h>
void isChild(int*);
int main(){
    int age;
    printf("Enter your age:");
    scanf("%d",&age);
    isChild(&age);

}
void isChild(int *a){
    if(*a>60){
        printf("Senior");

    }
    else{
        if(*a<12){
            printf("Child");
        }else{
            if(*a>=12 && *a<=19){
                printf("Teenager");
            }else{
                printf("Adult");
            }
        }
    }
}
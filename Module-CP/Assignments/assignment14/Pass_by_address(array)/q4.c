#include<stdio.h>
typedef struct HR{
    int id,salary,commision;
    char name[20];
}HR;
void storeHR(HR*,int);
void displayHR(HR*,int);
int main(){
    HR arr[5];

    storeHR(arr,5);
    displayHR(arr,5);

}
void storeHR(HR*arr,int s){
    printf("Enter HR Details:\n");
      for(int i=0;i<s;i++){
        printf("Enter ID:");
        scanf("%d",&arr[i].id);
        printf("Enter Salary:");
        scanf("%d",&arr[i].salary);
        printf("Enter Commision:");
        scanf("%d",&arr[i].commision);
        printf("Enter Nmae:");
        scanf("%s",arr[i].name);
      }
}
void displayHR(HR*arr,int s){
    printf("-----HR Details:-------");
      for(int i=0;i<s;i++){
        printf("ID = %d",arr[i].id);
        printf("Salary = %d",arr[i].salary);
        printf("commision = %d",arr[i].commision);
        printf("Name = %s",arr[i].name);
      }
    }

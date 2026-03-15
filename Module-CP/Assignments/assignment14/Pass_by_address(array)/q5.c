#include<stdio.h>
typedef struct SalesManager{
    int id,salary,target;
    int incentive;
    char name[20];
}SalesManager;
void storeSalesManager(SalesManager*,int);
void displaySalesManager(SalesManager*,int);
int main(){
    SalesManager arr[5];

    storeSalesManager(arr,5);
    displaySalesManager(arr,5);

}
void storeSalesManager(SalesManager*arr,int s){
    printf("Enter SalesManager Details:");
      for(int i=0;i<s;i++){
        printf("Enter Id:");
        scanf("%d",&arr[i].id);
        printf("Enter salary:");
        scanf("%d",&arr[i].salary);
        printf("Enter target:");
        scanf("%d",&arr[i].target);
        printf("Enter incentive:");
        scanf("%d",&arr[i].incentive);
        printf("Enter name:");
        scanf("%s",arr[i].name);
      }
}
void displaySalesManager(SalesManager*arr,int s){
    printf("-----SalesManager Details:-------");
      for(int i=0;i<s;i++){
        printf("ID = %d",arr[i].id);
        printf("Salary = %d",arr[i].salary);
        printf("Target = %d",arr[i].target);
        printf("Incentive = %d",arr[i].incentive);
        printf("Name = %s",arr[i].name);
      }
    }

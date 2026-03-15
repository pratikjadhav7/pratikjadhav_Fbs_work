#include<stdio.h>
typedef struct Student{
   int rollNo;
   char name[20];
   int marks;
}Student;
void storeStudent(Student*,int);
void displayStud(Student*,int);
int main(){
    Student arr[5];

    storeStudent(arr,5);
    displayStud(arr,5);
}
void storeStudent(Student*arr,int size){
    printf("Enter Details of Student:");
    for(int i=0;i<size;i++){
        printf("Enter roll_no:");
        scanf("%d",&arr[i].rollNo);
        printf("Enter name:");
        scanf("%s",arr[i].name);
        printf("Enter marks:");
        scanf("%d",&arr[i].marks);
    }
}
void displayStud(Student*arr,int size){
      printf("-----Student Details-----");
        for(int i=0;i<size;i++){
        printf("\nRollNo = %d",arr[i].rollNo);
        printf("\nName = %s",arr[i].name);
        printf("\nMarks = %d",arr[i].marks);
    }
}
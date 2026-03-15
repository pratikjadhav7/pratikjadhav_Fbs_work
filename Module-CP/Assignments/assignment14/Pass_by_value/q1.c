#include<stdio.h>
typedef struct Student{
    int rollNo;
    char name[20];
    int marks;
}Student;
Student storeStudent();
void display(Student);
int main(){
    Student s1,s2;
    s1=storeStudent();
    s2=storeStudent();
    printf("Details for S1:");
    display(s1);
    printf("Details for S2:");
    display(s2);
}
Student storeStudent(){
    Student s;
    printf("Enter Roll No: ");
    scanf("%d",&s.rollNo);
    printf("Enter Name: ");
    scanf("%s",s.name);
    printf("Enter Marks: ");
    scanf("%d",&s.marks);
    return s;
}
void display(Student s){
      printf("\nRoll No: %d",s.rollNo);
    printf("\nName: %s",s.name);
    printf("\nMarks: %d\n",s.marks);
}
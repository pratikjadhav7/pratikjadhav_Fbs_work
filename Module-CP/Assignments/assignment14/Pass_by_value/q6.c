#include<stdio.h>
typedef struct Date{
    int day,month,year;
}Date;
Date storeDate();
void display(Date);
int main(){
    Date d1,d2,d3;
    d1=storeDate();
    d2=storeDate();

    display(d1);
    display(d2);
}
Date storeDate(){
    Date d;
    printf("Enter Day:");
    scanf("%d",&d.day);
    printf("Enter Month:");
    scanf("%d",&d.month);
    printf("Enter Year:");
    scanf("%d",&d.year);

    return d;
}
void display(Date d){
     printf("\nDay:%d",d.day);
     printf("\nMonth:%d",d.month);
     printf("\nYear:%d",d.year );
}
#include<stdio.h>
#include<string.h>
typedef struct Book{
   char name[20];
   int id;
   char author[20];
   float price;
}Book;
Book storeBook();
void displayBook(Book);
int main(){
    Book b1,b2;
    
    printf("Enter Details For Book-1:");
    b1=storeBook();

    printf("\nEnter Details For Book-2:");
    b2=storeBook();


    printf("Details Of 1st Book:");
    displayBook(b1);

    printf("\nDetails Of 2nd Book:");
    displayBook(b2);
}
Book storeBook(){
    Book b;
    printf("\nBook ID:");
    scanf("%d",&b.id);
    printf("\nBook Name:");
    scanf("\n%s",b.name);
    printf("\nAuthor Name:");
    scanf("%s",b.author);
    printf("\nBook Price:");
    scanf("%f",&b.price);

    return b;
}

void displayBook(Book b){
    printf("\nBook ID: %d",b.id);
    printf("\nBook Name: %s",b.name);
    printf("\nBook Author: %s",b.author);
    printf("\nBook Price: %f",b.price);
}
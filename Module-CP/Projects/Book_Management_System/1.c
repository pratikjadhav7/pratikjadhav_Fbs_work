#include<stdio.h>
#include<string.h>
#define MAX 100
typedef struct Book{
    int id;
    char name[50];
    char author[50];
    char category[30];
    float price;
    float rating;
}Book;
Book b[MAX];
int count=0;
////////////////////////////////////////////////////////////
void addBook(){
    printf("\nEnter Book ID:");
    scanf("%d",&b->id);
    printf("\nEnter Book Name:");
    scanf("%s",b->name);
    printf("\nEnter Author Name:");
    scanf("%s",b->author);
    printf("\nEnter Category:");
    scanf("%s",b->category);
    printf("\nEnter Price:");
    scanf("%f",&b->price);
    printf("\nEnter Book Rating:");
    scanf("%f",&b->rating);

    count++;
    printf("----Book Added Successfully----");
}
/////////////////////////////////////////////////////////////
void displayBooks(){
    printf("\n-----ALL BOOKS-----\n");
    for(int i=0;i<count;i++){
        printf("\nID:%d | Name:%s | Author:%s | Category:%s | Price:%f | Rating:%f",b[i].id,b[i].name,b[i].author,b[i].category,b[i].price,b[i].rating);
    }
}
/////////////////////////////////////////////////////////////
void searchByID(){
    int id;
    int found=0;
    printf("Enter Book ID:");
    scanf("%d",&id);

    for(int i=0;i<count;i++){
        if(b[i].id==id){
            found=1;
            printf("Found:%s by %s",b[i].name,b[i].author);
        }else{
            printf("Not Found");
        }    
    }
}
///////////////////////////////////////////////////////////////
void searchByName(){
    char name[50];
    int found=0;
    printf("Enter Book Name: ");
    scanf("%s",name);

    for(int i=0;i<count;i++){
        if(strcmp(b[i].name,name)==0){
            found=1;
            printf("Found:%s by %s",b[i].name,b[i].author);
        }else{
            printf("Not Found");
        }
    }
}
//////////////////////////////////////////////////////////
void removeBook() {
    int id;
    printf("Enter Book ID to delete: ");
    scanf("%d",&id);
    for(int i=0;i<count;i++){
        if(b[i].id==id){
            for(int j=i;j<count-1;j++){
                b[j]=b[j+1];
            }
            count--;
            printf("Book Deleted Successfully!\n");
            return;
        }
    }
    printf("Book Not Found\n");
}
/////////////////////////////////////////////////////////////
void updateBook(){
    int id;
    printf("Enter Book ID for Updating: ");
    scanf("%d",&id);

    for(int i=0;i<count;i++){
        if(b[i].id==id){
            printf("Enter New Price:");
            scanf("%f",&b[i].price);

            printf("Enter New Rating:");
            scanf("%f",&b[i].rating);

            printf("Updated Successfully!");
        }
    }
    printf("Book Not Found");
}
///////////////////////////////////////////////////////
void showAuthorBooks(){
    char author[50];
    printf("Enter Author Name: ");
    scanf("%s",author);

    for(int i=0;i<count;i++){
        if(strcmp(b[i].author,author)==0){
            printf("%s",b[i].name);
        }
    }
}
/////////////////////////////////////////////////
void showCategoryBooks() {
    char cat[50];
    printf("Enter Category: ");
    scanf("%s",cat);

    for(int i=0;i<count;i++){
        if(strcmp(b[i].category,cat)==0){
            printf("%s",b[i].name);
        }
    }
}
////////////////////////////////////////////
void sortByPrice(){
    Book temp;
    for(int i=0;i<count;i++){
        for(int j=0;j<count-1;j++){
            if(b[j].price>b[j+1].price){
                temp=b[j];
                b[j]=b[j+1];
                b[j+1]=temp;
            }
        }
    }
    printf("Sorted By Price");
}
/////////////////////////////////////////////
void sortByRating(){
    Book temp;
    for(int i=0;i<count;i++){
        for(int j=0;j<count-1;j++){
            if(b[i].rating>b[i+1].rating){
                temp=b[j];
                b[j]=b[j+1];
                b[j+1]=temp;
            }
        }
    }
    printf("Sorted By Rating");
}
/////////////////////////////////////////////
int main(){
    int choice;
    do{
        printf("\n======BOOK MANAGEMENT SYSTEM======");
        printf("\n1. Add Book");
        printf("\n2. Remove Book");
        printf("\n3. Search by ID");
        printf("\n4. Search by Name");
        printf("\n5. Show Author Books");
        printf("\n6. Show category Books");
        printf("\n7. Update  Book");
        printf("\n8. Sort by Price");
        printf("\n9. Sort by Rating Book");
        printf("\n10. Display All");
        printf("\n0.  EXIT");
        scanf("\n%d",&choice);

        switch (choice) {
           case 1:addBook(); break;
           case 2:removeBook(); break;
           case 3:searchByID(); break;
           case 4:searchByName(); break;
           case 5:showAuthorBooks(); break;
           case 6:showCategoryBooks(); break;
           case 7:updateBook(); break;
           case 8:sortByPrice(); break;
           case 9:sortByRating(); break;
           case 10:displayBooks(); break;
           case 0:printf("EXITING...."); break;
           default:printf("Invalid Choice");
        }
    }
    while(choice!=0);
}

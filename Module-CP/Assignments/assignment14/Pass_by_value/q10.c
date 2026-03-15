#include<stdio.h>
typedef struct Product{
    int id;
    char name[20];
    int quantity;
    float price;

}Product;
Product storeProduct();
void display(Product);
int main(){
    Product p1,p2;

    p1=storeProduct();
    p2=storeProduct();
    
    printf("Details for Product-1:");
    display(p1);
    printf("Details for Product-2:");
    display(p2);
}
Product storeProduct(){
    Product p;

    printf("Enter ID:");
    scanf("%d",&p.id);
    printf("Enter Name:");
    scanf("%s",p.name);
    printf("Enter quantity:");
    scanf("%d",&p.quantity);
    printf("Enter price:");
    scanf("%f",&p.price);

    return p;

}
void display(Product hr){
    printf("\nID:%d",hr.id);
    printf("\nName:%s",hr.name);
    printf("\nquantity:%d",hr.quantity);
    printf("\nprice:%f",hr.price);
}
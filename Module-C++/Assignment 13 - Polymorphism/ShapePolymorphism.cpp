#include<iostream>
using namespace std;

struct Shape{
    double area;

    Shape(){
        this->area=0;
    }
    Shape(double area){
        this->area=area;
    }

    virtual void display(){
        cout<<"\nArea: "<<this->area;
    }
};

struct Circle :public Shape{
    double radius;

    Circle(){
        this->radius=00;
    }
    Circle(double rad):Shape(area){
        this->radius=rad;
    }

    void display(){
        Shape::display();
        cout<<"\nRadius: "<<this->radius;
    }
};

struct Triangle :public Shape{
    double base,height;

    Triangle(){
        this->base=00;
        this->height=00;
    }

    Triangle(double area,double base,double height):Shape(area){
        this->base=base;
        this->height-height;
    }
    void display(){
        Shape:: display();

        cout<<"\nBase: "<<this->base;
        cout<<"\nHeight: "<<this->height;
    }
};

struct Reactangle :public Shape{
    double len,bdth;

    Reactangle(){
        this->len=00;
        this->bdth=00;
    }
    Reactangle(double area,double len,double bdth):Shape(area){
       this->len=len;
       this->bdth=bdth;
    }

    void display(){
        Shape::display();

        cout<<"\nLength: "<<this->len;
        cout<<"\nBreadth: "<<this->bdth;
    }
};

int main(){
    Shape* sp;
    Shape s1(12.5);
    sp=&s1;
    sp->display();

    Triangle t1(2.3,4,7);
    sp=&t1;
    sp->display();

    Reactangle r1(7.3,8,9);
    sp=&r1;
    sp->display();
}
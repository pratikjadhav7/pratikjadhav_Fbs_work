#include<iostream>
using namespace std;

struct Artist{
    string name;
    int age;

    Artist(){
        this->name="not given";
        this->age=0;
    }
    Artist(string name,int age){
        this->name=name;
        this->age=age;
    }
    void display(){
        cout<<"Name: "<<this->name;
        cout<<"Age: "<<this->age;
    }
};

struct Painter :public Artist{
   string paintingStyle,mediumUsed;
   int noOfPaintings;

    Painter(){
    this->paintingStyle="Not Given";
    this->mediumUsed="Not given";
    this->noOfPaintings=00;
   }
   Painter(string name,int age,string style,string medium,int paintings):Artist( name,age){
    this->paintingStyle=style;
    this->mediumUsed=medium;
    this->noOfPaintings=paintings;
   }

   void display(){
    Artist::display();

    cout<<"Painting Style: "<<this->paintingStyle;
    cout<<"Medium Used: "<<this->mediumUsed;
    cout<<"No Of Paintings: "<<this->noOfPaintings;
   }
};

struct Musician :public Artist{
    string instrument,musicGenre;
    int noOfAlbums;

    Musician(){
        this->instrument="Not Given";
        this->musicGenre="Not Given";
        this->noOfAlbums=00;
    }

    Musician(string name,int age,string instrument,string genere,int noOfAlbums):Artist(name,age){
        this->instrument=instrument;
        this->musicGenre=genere;
        this->noOfAlbums=noOfAlbums;
    }

    void display(){
        Artist::display();

        cout<<"Instrument: "<<this->instrument;
        cout<<"Genre: "<<this->musicGenre;
        cout<<"Num Of Albums: "<<this->noOfAlbums;
    }
};

int main(){
    Artist a1("Ajay",40);
    a1.display();

    Painter p1("Pratik",24,"abc","qwer",40);
    p1.display();

    Musician m1("Mahesh",30,"sdfg","zxcvbn",90);
    m1.display();
}
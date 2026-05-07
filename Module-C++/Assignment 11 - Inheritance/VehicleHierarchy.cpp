#include<iostream>
using namespace std;

struct Vehicle{
    int vehicleNumber,noOfWheels;
    string model,companyName;
    double price;

    Vehicle(){
        this->vehicleNumber=0;
        this->noOfWheels=0;
        this->model="Not given";
        this->companyName="Not given";
        this->price=00;
    }
    Vehicle(int vehicleNumber,int noOfwheels,string model,string cName,double price){
        this->vehicleNumber=vehicleNumber;
        this->noOfWheels=noOfwheels;
        this->model=model;
        this->companyName=cName;
        this->price=price;
    }
    
    void display(){
        cout<<"\nVehicle Number: "<<this->vehicleNumber;
        cout<<"\nNo Of Wheels: "<<this->noOfWheels;
        cout<<"\nModel: "<<this->model;
        cout<<"\ncompany Name: "<<this->companyName;
        cout<<"\nPrice: "<<this->price;
    }
};

struct Bike :public Vehicle{
     int noOfStands,noOfHelmets;
     string bikeCategory;

     Bike(){
        this->noOfHelmets=0;
        this->noOfStands=0;
        this->bikeCategory="Not given";
     }

     Bike(int vehicleNumber,int noOfwheels,string model,string cName,double price,int stands,int helmets,string category)
     : Vehicle(vehicleNumber,noOfwheels, model, cName, price){
         this->noOfHelmets=helmets;
        this->noOfStands=stands;
        this->bikeCategory=bikeCategory;
     }
     void display(){
        Vehicle::display();

        cout<<"\nNo Of Stands: "<<this->noOfStands;
        cout<<"\nNo Of Helmets: "<<this->noOfHelmets;
        cout<<"\nBike Category: "<<this->bikeCategory;
     }
};

struct Car :public Vehicle{
   bool hasPowerSteering;
   string driveMode,parkingSensor;

   Car(){
    this->hasPowerSteering=true;
    this->driveMode="Not given";
    this->parkingSensor="Not Given";
   }
   Car(int vehicleNumber,int noOfwheels,string model,string cName,double price,bool hasPowerSteering,string drivemode,string sensor)
   : Vehicle(vehicleNumber,noOfwheels,model,cName,price){
    this->hasPowerSteering=hasPowerSteering;
    this->driveMode=drivemode;
    this->parkingSensor=sensor;
   }

   void display(){
      Vehicle::display();

      cout<<"\nPower Steering: "<<this->hasPowerSteering;
      cout<<"\nDrive mode: "<<this->driveMode;
      cout<<"\nParking Sensor"<<this->parkingSensor;
   }
};

struct Bus :public Vehicle{
    int passengerCapacity,standingCapacity;

    Bus(){
       this->passengerCapacity=00;
       this->standingCapacity=00; 
    }
    Bus(int vehicleNumber,int noOfwheels,string model,string cName,double price,int passengers,int standing)
    : Vehicle(vehicleNumber,noOfwheels,model,cName,price){
        this->passengerCapacity=passengers;
        this->standingCapacity=standing;
    }
    void display(){
        Vehicle::display();

        cout<<"\nPassengers: "<<this->passengerCapacity;
        cout<<"\nStanding Capacity: "<<this->standingCapacity;
    }
};

int main(){
    Vehicle v1(9302,2,"xyz","Bajaj",40000);
    v1.display();

    Bus b1(1234,4,"pqr","mahamandal",100000,50,20);
    b1.display();

    Car c1(8910,4,"Maruti","800",80000,true,"yes","no");
    c1.display();
}
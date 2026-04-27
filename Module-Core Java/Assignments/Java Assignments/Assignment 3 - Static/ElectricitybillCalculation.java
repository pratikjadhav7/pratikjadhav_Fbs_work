
class ElectricityBill {

    static double ratePerUnit;

    String customerName;
    int cunstomerID;
    double units;

    public ElectricityBill(String customerName, int cunstomerID, double units) {
        this.customerName = customerName;
        this.cunstomerID = cunstomerID;
        this.units = units;
    }

    static void updateRate(double newRate){
          ratePerUnit=newRate;
    }
    double calculateBill(){
        return units*ratePerUnit;
    }

    void displayBill(){
        System.out.println("Customer Name: "+this.customerName);
        System.out.println("Customer ID: "+this.cunstomerID);
        System.out.println("Total Units: "+this.units);
        System.out.println("Rate Per Unit: "+ElectricityBill.ratePerUnit);
        System.out.println("Total Bill: "+calculateBill());
    }
    
}

public class ElectricitybillCalculation {

    public static void main(String[] args) {

        ElectricityBill.updateRate(4.5);

        ElectricityBill e1=new ElectricityBill("Pratik",1,102);
        ElectricityBill e2=new ElectricityBill("Chetan",2,103);

        e1.displayBill();
        e2.displayBill();

        System.out.println("------After Rate Update------");

        ElectricityBill.updateRate(8);
        e1.displayBill();
        e2.displayBill();


    }
}

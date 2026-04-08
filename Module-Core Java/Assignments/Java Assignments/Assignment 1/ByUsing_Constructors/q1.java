
class Date {

    int day, month, year;
    String dow;
    
     Date(){
        this.day=1;
        this.month=5;
        this.year=2026;
        this.dow="Monday";
    }
     Date(int d,int mon,int yr,String Dow){
        this.day=d;
        this.month=mon;
        this.year=yr;
        this.dow=Dow;
    }

    void display(){
        System.out.println(this.day+"/"+this.month+"/"+this.year);
        System.out.println("Dow: "+this.dow);
    }
}

public class q1 {

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2,3,2014,"Friday");

        System.out.println("Default Constructors");
        d1.display();
        System.out.println("Parameterized constructor");
        d2.display();
    }
}

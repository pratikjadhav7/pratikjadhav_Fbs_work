class Date{
    int day,mon,yr;
    String dow;

    void setDay(int day){
        this.day=day;
    }
    void setMon(int mon){
        this.mon=mon;
    }
    void setYr(int yr){
        this.yr=yr;
    }
    void setDow(String dow){
        this.dow=dow;
    }

    int setDay(){
        return this.day;
    }
    int setMon(){
        return this.mon;
    }
    int setYr(){
        return this.yr;
    }
    String setDow(){
        return this.dow;
    }

    void display(){
        System.out.println(this.day + "/" +this.mon + "/" + this.yr);
        System.err.println("DOW: "+this.dow);
    }
}
public class q5{
    public static void main(String[] args) {
        Date d1=new Date();
        Date d2=new Date();

        d1.setDay(2);
        d1.setMon(4);
        d1.setYr(2026);
        d1.setDow("Monday");
        d2.setDay(1);
        d2.setMon(5);
        d2.setYr(2026);
        d2.setDow("Friday");

        d1.display();
        d2.display();
    }
}

class Date {

    int day, month, year;
    String dow;

    void setday(int day) {
        this.day = day;
    }

    void setMonth(int mon) {
        this.month = mon;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setDow(String dow) {
        this.dow = dow;
    }
    int getDay(){
        return this.day;
    }
    int getMonth(){
        return this.month;
    }
    int getYear(){
        return this.year;
    }
    String getDow(){
        return this.dow;
    }

    void display(){
        System.out.println(this.day+"/"+this.month+"/"+this.year);
        System.out.println("Dow: "+this.dow);
    }
}

public class q1 {

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        d1.setday(1);
        d1.setMonth(4);
        d1.setYear(2026);
        d1.setDow("Monday");
        d2.setday(1);
        d2.setMonth(5);
        d2.setYear(2024);
        d2.setDow("Friday");

        d1.display();
        d2.display();
    }
}

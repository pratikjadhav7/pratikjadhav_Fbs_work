
class Date {

    int day, month, year;
    String dow;

    Date() {
        this.day = 1;
        this.month = 5;
        this.year = 2026;
        this.dow = "Saturday";
    }

    Date(int d, int mon, int yr, String Dow) {
        this.day = d;
        this.month = mon;
        this.year = yr;
        this.dow = Dow;
    }

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

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
    }

    @Override
    public String toString() {
        return "Day: "+this.day+" Month: "+this.month+" Year: "+this.year+" DOW: "+this.dow;
    }

  
    
}

public class q1 {

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        Date d4 = new Date(2,3,2014,"Wednesday");

        d1.setday(1);
        d1.setMonth(4);
        d1.setYear(2026);
        d1.setDow("Monday");
        d2.setday(1);
        d2.setMonth(5);
        d2.setYear(2024);
        d2.setDow("Friday");

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());

    }
}

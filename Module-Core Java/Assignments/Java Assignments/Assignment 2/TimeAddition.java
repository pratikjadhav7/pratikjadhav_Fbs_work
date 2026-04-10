class Time {
    int hr, min, sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void normalize() {
        min += sec / 60;
        sec = sec % 60;

        hr += min / 60;
        min = min % 60;

        hr = hr % 24; // 24-hour format
    }

    Time add(Time t) {
        Time result = new Time(
            this.hr + t.hr,
            this.min + t.min,
            this.sec + t.sec
        );
        result.normalize();
        return result;
    }

    Time add(int hours) {
        Time result = new Time(this.hr + hours, this.min, this.sec);
        result.normalize();
        return result;
    }


    Time addMinutes(int minutes) {
        Time result = new Time(this.hr, this.min + minutes, this.sec);
        result.normalize();
        return result;
    }


    Time addSeconds(int seconds) {
        Time result = new Time(this.hr, this.min, this.sec + seconds);
        result.normalize();
        return result;
    }


    void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}


public class TimeAddition {
    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 30, 20);

        Time result1 = t1.add(t2);
        System.out.print("Addition of two Time objects: ");
        result1.display();

        Time result2 = t1.add(5);
        System.out.print("After adding hours: ");
        result2.display();

        Time result3 = t1.addMinutes(80);
        System.out.print("After adding minutes: ");
        result3.display();

        Time result4 = t1.addSeconds(125);
        System.out.print("After adding seconds: ");
        result4.display();
    }
}
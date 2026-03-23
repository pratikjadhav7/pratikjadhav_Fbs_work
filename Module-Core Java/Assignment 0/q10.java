public class q10{
    public static void main(String[] args) {
    int sub1,sub2,sub3,sub4,sub5;
    sub1 = 30;
    sub2 = 35;
    sub3 = 47;
    sub4 = 50;
    sub5 = 80;
    int total = sub1+sub2+sub3+sub4+sub5;
    System.out.printf("Total of marks of all subjects out of 500 is : %d\n",total);
    float avg = (float)total/500*100;
    System.out.printf("Percentage: %f",avg);
    }
}
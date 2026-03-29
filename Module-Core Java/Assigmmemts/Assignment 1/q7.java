import java.util.Scanner;
public class q7{
    public static void main(String[] args) {
        double salary;
        double basic,da,ta,hra;
        System.out.println("Enter Basic:");
        Scanner sc = new Scanner(System.in);
        basic=sc.nextDouble();

        if(basic<=5000){
            da=basic * 0.10;
            ta=basic * 0.20;
            hra=basic*0.25;
        }else{
            da=basic*0.15;
            ta=basic*0.25;
            hra=basic*0.30;
        }
        salary=basic+da+ta+hra;
        System.out.println("Total Salary:%f"+salary);
    }
}

import java.util.*;

public class q3 {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter n to Print Perfect Numbers:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i && sum != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}


public class PrimeNum {

    public static void main(String[] args) {
        int[] arr = {34, 56, 11, 40, 31, 7,56,97};
        for (int i = 0; i < arr.length; i++) {
            int isPrime = 1;
            if (arr[i] < 2) {
                isPrime = 0;
            } else {
                for (int j = 2; j < arr[i]/2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = 0;
                    }
                }
            }
            if (isPrime == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}

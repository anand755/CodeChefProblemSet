package enormous.input.test;

import java.util.Scanner;

public class EnormousInputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        scanner.nextLine();

        long[] arrT = new long[n];
        for (int i = 0; i < n; i++) {
            arrT[i] = scanner.nextLong();
        }
        int count = 0;
        for (long t : arrT) {
            if (t % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

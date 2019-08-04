package small.factorials;

import java.util.Scanner;

public class SmallFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcaseCount = scanner.nextInt();
        scanner.nextLine();
        int[] factRes = new int[testcaseCount];
        for (int i = 0; i < testcaseCount; i++) {
            int n = scanner.nextInt();
            factRes[i] = computFact(n);
        }
        for (int res : factRes) {
            System.out.println(res);
        }

    }

    private static int computFact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * computFact(n - 1);
        }
    }
}

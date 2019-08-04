package add.two.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        int[] resultArr = new int[testCaseCount];
        for (int i = 0; i < testCaseCount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            resultArr[i] = a + b;
        }
        for (int res : resultArr) {
            System.out.println(res);
        }
    }
}

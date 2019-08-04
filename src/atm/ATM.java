package atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double withdrawAmaount = scanner.nextDouble();
        double initialBalance = scanner.nextDouble();
        double remainBalance;
        if ((withdrawAmaount % 5 == 0) && (withdrawAmaount < initialBalance)) {
            remainBalance = initialBalance - withdrawAmaount - 0.50;
        } else {
            remainBalance = initialBalance;
        }
        System.out.println(remainBalance);
    }
}

package bank_system;

import java.util.Scanner;

public class InputUtils {
    public static int input(Scanner scanner){
        System.out.println("1. Deposit     2. Withdrawal    3. show Balances");
        System.out.print("Choose one : ");
        return scanner.nextInt();
    }
}

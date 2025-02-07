package fintech.driver;

import java.util.Scanner;

import fintech.model.Account;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read account creation input
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        if ("create-account".equals(command)) {
            Account account = new Account(command, owner, accountName);
            System.out.println(account.toString());
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }
}
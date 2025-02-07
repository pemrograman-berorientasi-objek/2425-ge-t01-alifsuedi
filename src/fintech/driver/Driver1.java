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

        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        Double balance = 0.0;

        System.out.println(accountName + "|" + owner + "|" + balance);
        scanner.close();
    }
 }

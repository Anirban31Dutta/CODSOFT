import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
    	
        int choice;
        do {
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Check balance\n4. Exit");
            System.out.print("Enter the choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!withdraw()) {
                        System.out.println("Insufficient balance for withdrawal");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private boolean withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        return account.withdraw(amount);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        atm.start();
    }
}
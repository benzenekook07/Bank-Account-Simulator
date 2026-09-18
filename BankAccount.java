// BankAccount.java
public class BankAccount {
    private String name;
    private int accNo;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Current Balance: " + balance);
    }
}

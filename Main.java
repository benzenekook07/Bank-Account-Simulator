import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample account
        BankAccount acc = new BankAccount("Diya", 101, 1000);

        // Menu-driven program
        while (true) {
            System.out.println("\n--- Bank Account Simulator ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Account Simulator!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

import java.util.Scanner;

public class SimpleBankingApp 
{
   
    static class BankAccount 
    {
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber, double initialBalance) 
        {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public void deposit(double amount)
        {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }

        public void withdraw(double amount) 
        {
            if (balance >= amount) 
            {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            }
            else 
            {
                System.out.println("Insufficient balance.");
            }
        }

        public void checkBalance() 
        {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(accountNumber, initialBalance);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

         
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close(); 
    }
}


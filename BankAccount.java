public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Current balance: %.1f%n", balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Current balance: %.1f%n", balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.printf("Current balance: %.1f%n", balance);
    }
}

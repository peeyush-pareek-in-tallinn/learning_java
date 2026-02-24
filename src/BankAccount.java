public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount (String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double depositMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += amount;
        }
        return balance;
    }

    public double withdrawMoney(double amount) {
        if (balance < amount) {
            System.out.println("Paisa nahin hai");
            return balance;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount("A001", "Ram");
        newAccount.depositMoney(1001);
        newAccount.depositMoney(500);
        newAccount.withdrawMoney(301);
        System.out.println(newAccount.balance);
        newAccount.depositMoney(-40);
        newAccount.withdrawMoney(0);
    }
}

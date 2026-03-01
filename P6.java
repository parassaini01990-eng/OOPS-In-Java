class BankAccount {
    long accountNo;
    double balance;

    public void display(long a, double b) {
        this.accountNo = a;
        this.balance = b;
        System.out.println("Account No: " + this.accountNo + " " + "Balance: " + this.balance);
    }

    public void deposit(double amount) {

        System.out.println(" Deposit Amount: " + amount);

        balance = balance + amount;
        System.out.println("After deposit Amount: " + balance);
    }

    public void withdraw(double withdrawamt) {
        System.out.println("Withdrawl Amount:" + withdrawamt);
        if (withdrawamt <= balance) {
            balance = balance - withdrawamt;
            System.out.println("Left Amount: " + balance);
        } else {
            System.out.println("Insufficient balance");

        }
    }
}

public class P6 {
    public static void main(String[] args) {
        BankAccount bAccount = new BankAccount();
        bAccount.display(1234567789, 200.567);
        bAccount.deposit(10000);
        bAccount.withdraw(12000);

    }
}

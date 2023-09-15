class BankAccount {
    double balance;

    void accountReplenishment(double amount) {
        balance += amount;
    }

    void accountWithdrawal(double amount) {
        balance -= amount;
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.balance = 30000;
        a.accountReplenishment(23.5);
        System.out.println("Пополнение счёта: " + a.balance);

        BankAccount b = new BankAccount();
        b.balance = 30000;
        b.accountWithdrawal(23.5);
        System.out.println("Снятие со счёта: " + b.balance);
    }
}


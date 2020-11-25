public class BankAccount {

    private float balance;

    BankAccount () {
    }

    BankAccount(float balance)
    {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(float amount) {
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else System.out.println("ОПЕРАЦИЯ ОТКЛОНЕНА. НЕДОСТАТОЧНО СРЕДСТВ НА СЧЁТЕ.");
    }
}
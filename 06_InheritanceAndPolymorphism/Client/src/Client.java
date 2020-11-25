public abstract class Client {
    private float balance;
    private String number;

    Client() {
    }

    Client(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract String generationNumber();

    public void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(float amount) {
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else System.out.println("ОПЕРАЦИЯ ОТКЛОНЕНА. НЕДОСТАТОЧНО СРЕДСТВ НА СЧЁТЕ");
    }
}
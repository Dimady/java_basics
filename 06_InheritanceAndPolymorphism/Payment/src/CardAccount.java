public class CardAccount extends BankAccount {

    CardAccount () {
    }

    public CardAccount(float balance) {
        super(balance);
    }

    public void withdraw(float amount) {
        super.withdraw(amount * 1.01f);
    }
}
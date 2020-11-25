public class Entrepreneurs extends Client{

    public Entrepreneurs(float balance) {
        super(balance);
    }

    @Override
    public String generationNumber() {
        return ("407" + String.valueOf((long) (1E17 * Math.random())));
    }

    public void deposit(float amount) {
        if (amount < 1000) super.deposit(amount * 0.99f);
        else if (amount >= 1000) super.deposit(amount * 0.995f);
    }
}

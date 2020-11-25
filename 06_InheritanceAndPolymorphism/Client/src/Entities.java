public class Entities extends Client{

    public Entities(float balance) {
        super(balance);
    }

    @Override
    public String generationNumber() {
        return ("407" + String.valueOf((long) (1E17 * Math.random())));
    }

    public void withdraw(float amount) {
        super.withdraw(amount * 1.01f);
    }
}

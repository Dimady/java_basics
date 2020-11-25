public class Individuals extends Client{

    public Individuals(float balance) {
        super(balance);
    }

    @Override
    public String generationNumber() {
        return ("408" + String.valueOf((long) (1E17 * Math.random())));
    }

}

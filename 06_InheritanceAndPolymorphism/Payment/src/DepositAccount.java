import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate date = LocalDate.of(2020,05,03);

    DepositAccount () {
    }

    public DepositAccount(float balance) {
        super(balance);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void deposit(float amount) {
        super.deposit(amount);
        setDate(LocalDate.now());
    }

    public void withdraw(float amount) {
        if  (LocalDate.now().compareTo(getDate().plusMonths(1)) > 0) {
            super.withdraw(amount);
        } else System.out.println("ОПЕРАЦИЯ ОТКЛОНЕНА. НЕ ПРОШЁЛ 1 МЕСЯЦ С МОМЕНТА ПОПОЛНЕНИЯ СЧЁТА.");
    }

}
public class BankApp {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(5000.0f);
        CardAccount acct2 = new CardAccount(2000.0f);
        DepositAccount acct3 = new DepositAccount(500.0f);
        System.out.println("РАСЧЁТНЫЙ СЧЁТ");
        System.out.println(acct1.getBalance());
        acct1.deposit(22000.00f);
        System.out.println(acct1.getBalance());
        acct1.withdraw(2000.00f);
        System.out.println(acct1.getBalance());
        acct2.withdraw(1000f);
        System.out.println("КАРТОЧНЫЙ СЧЁТ");
        System.out.println(acct2.getBalance());
        acct2.withdraw(30000.00f);
        System.out.println(acct2.getBalance());
        System.out.println("ДЕПОЗИТАРНЫЙ СЧЁТ. СЧЁТ ОТКРЫТ: " + acct3.getDate());
        acct3.deposit(2000.00f);
        System.out.println(acct3.getBalance());
        acct3.withdraw(1000.00f);
        System.out.println(acct3.getBalance());
    }

}
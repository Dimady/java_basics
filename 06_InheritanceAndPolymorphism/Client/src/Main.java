public class Main {
    public static void main(String[] args) {
        Individuals client1 = new Individuals(5000.0f);
        Entities client2 = new Entities(2000.0f);
        Entrepreneurs client3 = new Entrepreneurs(500.0f);
        System.out.println("ФИЗИЧЕСКОЕ ЛИЦО");
        client1.setNumber(client1.generationNumber());
        System.out.println("НОМЕР РАСЧЁТНОГО СЧЁТА: " + client1.getNumber());
        System.out.println(client1.getBalance());
        client1.deposit(22000.00f);
        System.out.println(client1.getBalance());
        client1.withdraw(2000.00f);
        System.out.println(client1.getBalance());
        System.out.println("ЮРИДИЧЕСКОЕ ЛИЦО");
        client2.setNumber(client2.generationNumber());
        System.out.println("НОМЕР РАСЧЁТНОГО СЧЁТА: " + client2.getNumber());
        client2.withdraw(1000f);
        System.out.println(client2.getBalance());
        client2.withdraw(30000.00f);
        System.out.println(client2.getBalance());
        System.out.println("ИНДИВИДУАЛЬНЫЙ ПРЕДПРИНИМАТЕЛЬ");
        client3.setNumber(client3.generationNumber());
        System.out.println("НОМЕР РАСЧЁТНОГО СЧЁТА: " + client3.getNumber());
        client3.deposit(2000.00f);
        System.out.println(client3.getBalance());
        client3.withdraw(1000.00f);
        System.out.println(client3.getBalance());
        client3.deposit(500.00f);
        System.out.println(client3.getBalance());
    }
}

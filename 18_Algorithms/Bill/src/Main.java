import java.util.ArrayList;

public class Main {
public static final int N = 10;

    public static void main(String[] args) {
        ArrayList<Bill> bank = new ArrayList<>();
        float sum = 0;
        for (int i = 0; i < N; i++) {
            Bill bill = new Bill();
            bill.setTransaction((float) Math.random() * 1000);
            bank.add(bill);
        }
        for (int i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++)
            {
                sum += TransactionCalculator.calculateTotalSum(bank.get(i), bank.get(j));
            }
        System.out.println("Сумма всех транзакций = " + sum);
    }
}

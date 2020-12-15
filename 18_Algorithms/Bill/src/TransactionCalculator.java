public class TransactionCalculator {
    static float calculateTotalSum(Bill sourceBill, Bill destinationBill)
    {
        return sourceBill.getTransaction() + destinationBill.getTransaction();
    }
}

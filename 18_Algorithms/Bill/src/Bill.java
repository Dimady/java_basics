public class Bill {
    private float transaction;
        Bill() {
        }
        private Bill(float transaction) {
            this.transaction = transaction;
        }

        public float getTransaction() {
            return transaction;
        }

        public void setTransaction(float transaction) {
            this.transaction = transaction;
        }
}

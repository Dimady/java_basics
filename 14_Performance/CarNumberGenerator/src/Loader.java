import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Loader {

    private static final int THREAD_AMOUNT = 10; // Количество потоков

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
            ExecutorService pool = Executors.newFixedThreadPool(THREAD_AMOUNT);
            for (int i = 0; i < THREAD_AMOUNT; i++) {
                pool.submit(new FileWriterThread(i));
                System.out.println(new StringBuilder("Thread#").append(i).append(" started.").toString());
            }
            pool.shutdown();
        try {
            pool.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - startTime) + " ms\n");
    }

}

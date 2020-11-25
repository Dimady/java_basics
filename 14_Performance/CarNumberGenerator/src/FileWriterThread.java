import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterThread extends Thread {
    private final int N = 100; // Количество номеров на один поток
    private int threadNum; // Порядковый номер текущего потока

    public FileWriterThread(int threadNum) {
        this.threadNum = threadNum;
    }
        @Override
        public void run() {
            try {
                PrintWriter writer = new PrintWriter(new StringBuilder("res/numbers").append(threadNum).append(".txt").toString());
                char letters[] = {'У', 'К', 'Е', 'Н', 'Х', 'В', 'А', 'Р', 'О', 'С', 'М', 'Т'};
                int regionCode = 199;
                for (int number = (N * threadNum + 1); number < (N * threadNum + N); number++) {
                StringBuilder builder = new StringBuilder();
                    for (char firstLetter : letters) {
                        for (char secondLetter : letters) {
                            for (char thirdLetter : letters) {
                                builder.append(firstLetter);
                                builder.append(padNumber(number, 3));
                                builder.append(secondLetter);
                                builder.append(thirdLetter);
                                builder.append(padNumber(regionCode, 2));
                                builder.append("\n");
                            }
                        }
                    }
                writer.write(builder.toString());
                }
                writer.flush();
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    private static String padNumber(int number, int numberLength)
    {
        StringBuilder numberStr = new StringBuilder(Integer.toString(number));
        int padSize = numberLength - numberStr.length();

        for(int i = 0; i < padSize; i++) {
            numberStr.insert(0,"0");
        }
        return numberStr.toString();
    }
}

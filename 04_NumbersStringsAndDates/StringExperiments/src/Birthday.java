import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Birthday {
    public static void main(String[] args) {
        int AGE = 41;  // Возраст
        int DATA = 25; // Дата рождения
        int MONTH = 10;
        int YEAR = 1978;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        String myString;
        for (int i = 0; i<= AGE; i++ ) {
            calendar.set(YEAR + i, MONTH - 1, DATA);
            myString = dayFormat.format(calendar.getTime());
            System.out.println(i + " - " + myString);
        }
    }
}

import javax.swing.*;
import java.util.*;

public class FindNumber {
    public static final int R = 200;

    private static void getList(ArrayList numberList) {
        System.out.println("ВАШ СПИСОК КРАСИВЫХ НОМЕРОВ АВТОМОБИЛЕЙ: ");
        for (int i = 0; i < numberList.size(); i++)
            System.out.println(i + " - " + numberList.get(i));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numberList = new ArrayList<>();
        HashSet<String> numList = new HashSet<>();
        TreeSet<String> nList = new TreeSet<>();
        StringBuilder builder = new StringBuilder();
        String Letters = "АВЕКМНОРСТУХ";
        String number, num, nnn, digit;
        int count;
        count = 0;
        for (int r = 1; r < R; r++) {
            for (int x = 0; x < Letters.length(); x++) {
                for (int n = 0; n < 10; n++) {
                    for (int y = 0; y < Letters.length(); y++) {
                        for (int z = 0; z < Letters.length(); z++) {
                            builder.append(Letters.charAt(x));
                            digit = Integer.toString(n);
                            nnn = digit + digit + digit;
                            builder.append(nnn);
                            builder.append(Letters.charAt(y));
                            builder.append(Letters.charAt(z));
                            digit = Integer.toString(r);
                            if (r < 10) digit = "0" + digit;
                            builder.append(digit);
                            number = builder.toString();
                            numberList.add(count, number);
                            count++;
                            builder = new StringBuilder();
                        }
                    }
                }
            }
        }
        // getList(numberList);
        System.out.println("Раскладка клавиатуры - RUS");
        System.out.println("Введите номер автомобиля: ");
        num = scanner.nextLine();
        long start1 = System.nanoTime();
        if (numberList.contains(num)) System.out.print("Поиск перебором: номер " + num + " найден, ");
        else System.out.print("Поиск перебором: номер " + num + " не найден, ");
        long duration1 = System.nanoTime() - start1;
        System.out.println("поиск занял: " + duration1 + " нс");
        Collections.sort(numberList);
        long start2 = System.nanoTime();
        if (Collections.binarySearch(numberList, num) >= 0)
            System.out.print("Бинарный  поиск: номер " + num + " найден, ");
        else System.out.print("Бинарный  поиск: номер " + num + " не найден, ");
        long duration2 = System.nanoTime() - start2;
        System.out.println("поиск занял: " + duration2 + " нс");
        numList.addAll(numberList);
        long start3 = System.nanoTime();
        if (numList.contains(num)) System.out.print("Поиск в HashSet: номер " + num + " найден, ");
        else System.out.print("Поиск в HashSet: номер " + num + " не найден, ");
        long duration3 = System.nanoTime() - start3;
        System.out.println("поиск занял: " + duration3 + " нс");
        nList.addAll(numberList);
        long start4 = System.nanoTime();
        if (nList.contains(num)) System.out.print("Поиск в TreeSet: номер " + num + " найден, ");
        else System.out.print("Поиск в TreeSet: номер " + num + " не найден, ");
        long duration4 = System.nanoTime() - start4;
        System.out.println("поиск занял: " + duration4 + " нс");
    }
}
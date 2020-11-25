import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    static final int MAX_DIGIT = 10;
    private static String command;

    private static String numberExist(TreeMap<String, String> phList, String number) {
        String name = null;
        for (String key : phList.keySet())
            if (number.equals(phList.get(key))) name = key;
        return name;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> phList = new TreeMap<>();
        Pattern names = Pattern.compile("[а-яА-Яa-zA-Z]");
        Pattern phones = Pattern.compile("[+?0-9]");

        while (true) {
            System.out.println("Введите данные (имя или номер телефона): " +
                    "LIST - вывод телефонной книги в консоль:");
            command = scanner.nextLine();

            if (command.equals("LIST")) {
                for (String allList : phList.keySet()) {
                    System.out.println(allList + " " + phList.get(allList));
                }
                continue;
            }

            Matcher matchName = names.matcher(command);
            Matcher matchPhone = phones.matcher(command);

            if (matchName.find()) {
                String name = command.replaceAll("[^а-яА-Яa-zA-Z]", "").trim();
                System.out.println("Вы ввели имя: " + name);

                if (phList.containsKey(name)) {
                    System.out.println("Данные телефонного номера: " + name + " <=> " + phList.get(name));
                } else
                    {
                        System.out.println("Номер телефона отсутствует в телефонной книге. " +
                            "Введите номер телефона: " + name + " <=> ");
                        String newNumber;
                            while (true)
                            {
                                newNumber = scanner.nextLine();
                                Matcher newMatchPhone = phones.matcher(newNumber);
                                if (newMatchPhone.find()) break;
                                System.out.println("Вы неправильно ввели номер телефона! Попробуйте ещё раз.");
                            }
                            String number = newNumber.replaceAll("[^0-9]", "").trim();
                            if ((number.length() > MAX_DIGIT + 1) || (number.length() < MAX_DIGIT) ||
                                    (number.length() == MAX_DIGIT) && ((number.charAt(0) == '7')
                                            || (number.charAt(0) == '8'))) {
                                System.out.println("Вы неправильно ввели номер телефона!");
                                continue;
                            }
                            if (number.length() > MAX_DIGIT) number = number.substring(1);
                            number = number.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                                    "+7 $1 $2-$3-$4");
                        System.out.println("Вы ввели номер телефона: " + number);
                    phList.put(name, number);
                }
                continue;
            }
            if (matchPhone.find())
            {
                String number = command.replaceAll("[^0-9]", "").trim();
                if ((number.length() > MAX_DIGIT + 1) || (number.length() < MAX_DIGIT) ||
                        (number.length() == MAX_DIGIT) && ((number.charAt(0) == '7') ||
                                (number.charAt(0) == '8')))
                {
                    System.out.println("Вы неправильно ввели номер телефона!");
                    continue;
                }
                if (number.length() > MAX_DIGIT)  number = number.substring(1);
                number = number.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                        "+7 $1 $2-$3-$4");
                System.out.println("Вы ввели номер телефона: " + number);
                String oldName = numberExist(phList, number);
                if (oldName != null)
                    System.out.println("Данные телефонного номера: " + oldName + " <=> " + number);
                else
                    {
                        System.out.println("Данные контакта неизвестны. Введите имя: " + number + " <=> ");
                        String newName;
                         while (true)
                         {
                             newName = scanner.nextLine();
                             Matcher newMatchName = names.matcher(newName);
                             if (newMatchName.find()) break;
                             System.out.println("Вы неправильно ввели имя! Попробуйте ещё раз.");
                         }
                        System.out.println("Вы ввели имя: " + newName);
                    phList.put(newName, number);
                }
                continue;
            }
        }
    }
}
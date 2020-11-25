import java.util.Scanner;
import java.util.TreeSet;

public class Email {
    private static String command;
    private static void List(TreeSet emails)
    {
        System.out.println("ВАШ СПИСОК EMAIL в алфавитном порядке: ");
        for (Object email : emails)
            System.out.println(email);
    }
    private static void Add(String command, TreeSet emails)
        {
            int x = command.indexOf(" ");
            if (x == -1) return;
            if (command.substring(0, x).length() == 3)
            {
                String email = command.substring(x + 1);
                if (email.matches("(.*)@(.*)\\.(.*)") && (email.length() >= 5))
                {
                    emails.add(email);
                    System.out.println("Добавлен новый EMAIL: " + email);
                    List(emails);
                } else System.out.println("Введён неверный EMAIL");
            }
        }
    private static void Help()
    {
            System.out.println("СПИСОК КОМАНД:");
            System.out.println("LIST");
            System.out.println("ADD email");
            System.out.println("HELP");
    }
    private static boolean isList(String command) {
        return command.equals("LIST");
    }
    private static boolean isAdd(String command) {
        return command.contains("ADD");
    }
    private static boolean isHelp(String command) {
            return command.equals("HELP");
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       TreeSet<String> emails = new TreeSet<>();
       emails.add("piterlic@mail.ru");
       emails.add("romashka14108@mail.ru");
       List(emails);
       while (true)
       {
           System.out.println("Введите команду: ");
           command = scanner.nextLine();
           if (isList(command)) List(emails);
           else if (isAdd(command)) Add(command, emails);
           else if (isHelp(command)) Help();
       }
    }
}

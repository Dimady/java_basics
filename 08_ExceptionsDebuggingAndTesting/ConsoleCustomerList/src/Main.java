import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    private static String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static String commandError = "Неверная команда! Доступные примеры команд: \n" +
            commandExamples;
    private static String helpText = "Command examples:\n" + commandExamples;
    public static String phoneError = "Неверный формат телефона! Верный формат: +79215637722";
    public static String emailError = "Неверный формат email! Верный формат: vasily.petrov@gmail.com";
    public static String addError = "Неверный формат команды add. Верный формат:\n" +
            "\tadd Василий Петров vasily.petrov@gmail.com +79215637722";
    public static String removeError = "Неверный формат команды remove. Верный формат:\n" +
            "\tremove Василий Петров";
    private static String listError = "Неверный формат команды list. Верный формат:\n" + "\tlist";
    private static String countError = "Неверный формат команды count. Верный формат:\n" + "\tcount";
    private static String helpError = "Неверный формат команды help. Верный формат:\n" + "\thelp";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        Pattern letter = Pattern.compile("[а-яА-Яa-zA-Z]");

        for(;;) {
                try {
                    String command = scanner.nextLine();
                    String[] tokens = command.split("\\s+",2);
                    if (tokens[0].equals("add")) {
                        if (command.length() < 4) {
                            throw new Exceptions.CommandException(addError);
                        } else executor.addCustomer(tokens[1]);
                    } else if (tokens[0].equals("list")) {
                        if (command.contains(" ")) {
                            throw new Exceptions.CommandException(listError);
                        } else executor.listCustomers();
                    } else if (tokens[0].equals("remove")) {
                        if (command.length() < 7) {
                            throw new Exceptions.CommandException(removeError);
                        }
                        Matcher isLetter = letter.matcher(tokens[1]);
                        if (!isLetter.find()) {
                            throw new Exceptions.CommandException(removeError);
                        } else executor.removeCustomer(tokens[1]);
                    } else if (tokens[0].equals("count")) {
                        if (command.contains(" ")) {
                            throw new Exceptions.CommandException(countError);
                        } else System.out.println("There are " + executor.getCount() + " customers");
                    } else if (tokens[0].equals("help")) {
                        if (command.contains(" ")) {
                            throw new Exceptions.CommandException(helpError);
                        } else System.out.println(helpText);
                    } else {
                        System.out.println(commandError);
                    }
                } catch (Exceptions.CommandException e) {
                    System.out.println(e.getMessage());
                }
        }

    }

}

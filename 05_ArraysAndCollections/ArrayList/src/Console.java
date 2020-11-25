import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Console {
    private static String command, delo;

    private static void getList(ArrayList todoList)
    {
        System.out.println();
        System.out.println("ВАШ СПИСОК ДЕЛ: ");
        for (int i = 0; i < todoList.size(); i++)
            System.out.println(i + " - " + todoList.get(i));
    }
    private static void getEdit(String command, ArrayList todoList)
        {
        int x;
        if (command.length() > 4)
        {
            String s = command.replaceAll("[^0-9]", "");
            if (s.length() > 0) x = parseInt(s);
            else return;
            if (x < todoList.size())
            {
                delo = command.substring(4);
                delo = delo.replaceAll("[0-9]", "").trim();
                todoList.set(x, delo);
                System.out.print("Дело № " + x + " отредактировано: " + delo);
                getList(todoList);
            }
            else System.out.println("Такого дела не существует");
        }
    }
    private static void getAdd(String command, ArrayList todoList)
        {
        int x;
        if (command.length() >= 3)
        {
            String s = command.replaceAll("[^0-9]", "");
            if (s.length() > 0) x = parseInt(s);
            else
                {
                    x = todoList.size();
                    delo = command.substring(3).trim();
                    todoList.add(x, delo);
                    System.out.println("Добавлено дело под № " + x + ": " + delo);
                    getList(todoList);
                    return;
                };
            if (x <= todoList.size())
            {
                delo = command.substring(3);
                delo = delo.replaceAll("[0-9]", "").trim();
                todoList.add(x, delo);
                System.out.print("Добавлено дело под № " + x + ": " + delo);
                getList(todoList);
            }
            else System.out.println("Нарушен порядковый номер следования дел");
        }
    }
    private static void getDelete(String command, ArrayList todoList)
        {
        int x;
        if (command.length() > 6)
        {
            String s = command.replaceAll("[^0-9]", "");
            if (s.length() > 0) x = parseInt(s);
            else return;
            if (x < todoList.size())
            {
                System.out.println("Дело под № " + x + " удалено");
                todoList.remove(x);
                getList(todoList);
            }
            else System.out.println("Такого дела не существует");
        }
    }
    private static void getHelp()
    {
            System.out.println("СПИСОК КОМАНД:");
            System.out.println("LIST");
            System.out.println("EDIT (index) Новое название дела");
            System.out.println("ADD Какое-то дело");
            System.out.println("ADD (index) Какое-то дело");
            System.out.println("DELETE (index)");
            System.out.println("HELP");
    }
    private static boolean isList(String command) {
        return command.equals("LIST");
    }
    private static boolean isEdit(String command) {
        return command.contains("EDIT");
    }
    private static boolean isAdd(String command) {
        return command.contains("ADD");
    }
    private static boolean isDelete(String command) {
        return command.contains("DELETE");
    }
    private static boolean isHelp(String command) {
            return command.equals("HELP");
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> todoList = new ArrayList<>();
       todoList.add("Сделать зарядку");
       todoList.add("Поесть");
       todoList.add("Собраться на работу");
       todoList.add("Выйти на пробежку");
       todoList.add("Лечь спать");
       getList(todoList);
       while (true)
       {
           System.out.println("Введите команду: ");
           command = scanner.nextLine();
           if (isList(command)) getList(todoList);
           else if (isEdit(command)) getEdit(command, todoList);
           else if (isAdd(command)) getAdd(command, todoList);
           else if (isDelete(command)) getDelete(command, todoList);
           else if (isHelp(command)) getHelp();
       }
    }
}

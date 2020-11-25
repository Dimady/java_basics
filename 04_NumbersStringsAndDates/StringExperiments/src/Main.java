public class Main {
    public static void main(String[] args) {
        String name = "Иванов Сергей Петрович";
        String[] fio;
        String[] n = {"Фамилия: ", "Имя: ", "Отчество: "};
        int count = 0;
            for (int x = 0; x < name.length(); x++)
                if (name.charAt(x) == ' ') count++;
            if (count != 2)
             {
               System.out.println("Неправильно введено имя!");
               System.exit(0);
             };
        fio = name.split(" ");
        for (int i = 0; i < fio.length; i++) System.out.println(n[i] + fio[i]);
    }
}

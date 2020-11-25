import java.util.Scanner;

public class Phone {
    private static String phoneNumber, phoneNum;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         System.out.println("Введите номер телефона: ");
         phoneNumber = scanner.nextLine();
         phoneNum = phoneNumber.replaceAll("[^0-9]","");
         if ((phoneNum.length() > 11) || (phoneNum.length() < 10) ||
                (phoneNum.length() == 10) && ((phoneNum.charAt(0) == '7') || (phoneNum.charAt(0) == '8')))
            {
              System.out.println("Неправильно введён номер телефона!");
              System.exit(0);
            }
         if (phoneNum.length() > 10)  phoneNum = phoneNum.substring(1);
         System.out.println("Введён номер телефона: " + phoneNum.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+7 $1 $2-$3-$4"));
    }
}

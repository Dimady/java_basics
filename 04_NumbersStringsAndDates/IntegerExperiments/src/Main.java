public class Main
{
    private static Integer sum;
    private static String digits;
    private static char c;
    private static int number,s;
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        number = 4567;
        System.out.println("Сумма цифр числа " + number + ": " + sumDigits(number));
        c = '9';
        s = Character.getNumericValue(c);
        System.out.println("Символ " + c + " переведён в цифру " + s);
    }

    public static Integer sumDigits(Integer number)
    {
        digits = number.toString();
        sum = 0;
        for (int i = 0; i < digits.length(); i++)
            sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
        return sum;
    }
}


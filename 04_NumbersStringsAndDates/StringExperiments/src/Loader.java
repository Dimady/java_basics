
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int earnings1, earnings2, earnings3;
        String newText = text.replaceAll("[^0-9,]","");
        String[] text1 = newText.split(",");
        earnings1 = Integer.parseInt(text1[0]);
        earnings2 = Integer.parseInt(text1[1]);
        earnings3 = Integer.parseInt(text1[2]);
        System.out.println("Вася, Петя и Маша вместе заработали: " + (earnings1 + earnings2 + earnings3) + " руб.");
    }
}
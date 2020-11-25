public class Text {
    public static void main(String[] args) {
        String text = "For two years the BBC's Emma Jane Kirby has been investigating the story of Sgt Paul Meyer, a homesick American mechanic who stole a plane from a US airbase in England in 1969, to fly home to his wife in Virginia. The story resonated with Dutch reader Theo Van Eijck, who says he too stole a plane while serving in the forces. But he survived to tell the tale.\n" +
                "\n" +
                "Theo Van Eijck's little house in Somerset is a treasure trove of curiosities. Toy witches swing on tiny broomsticks from the ceiling of his sitting room, a family of ceramic cats peers down inquiringly from the higher shelves and a couple of skulls sit grinning on the sideboard.\n" +
                "\n" +
                "But the most fascinating items of all are spread out on Van Eijck's coffee table - Dutch newspaper clippings from 1964, with show-stopping headlines reporting the antics of a young sailor who stole a Grumman Tracker propeller plane from his military base in Malta and flew it to Benghazi, Libya.\n" +
                "\n" +
                "\"It's me!\" laughs Van Eijck, now whitehaired and aged 76. \"That's me right there in the photo and I was just 21!\"";
        String text1 = text.replaceAll("[^a-z A-Z]","");
        String[] words = text1.split("\\s+");
        for (int i=0; i < words.length; i++)
        {
          System.out.println(words[i]);
        }
    }
}

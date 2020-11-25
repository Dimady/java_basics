public class Loader
{
    private static Cat getKitten() {
        Cat kitten = new Cat(1100.0);
        return kitten;
    }

    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat musya = new Cat();
        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat kuzya = new Cat();
        Cat persik = new Cat();
        Cat marsik = new Cat();
        System.out.println("Мурка весит " + murka.getWeight() + " грамм");
        System.out.println("Муся весит " + musya.getWeight() + " грамм");
        System.out.println("Мурзик весит " + murzik.getWeight() + " грамм");
        System.out.println("Барсик весит " + barsik.getWeight() + " грамм");
        System.out.println("Кузя весит " + kuzya.getWeight() + " грамм");
        System.out.println("Персик весит " + persik.getWeight() + " грамм");
        System.out.println("Марсик весит " + marsik.getWeight() + " грамм");
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println();
        murka.feed(murka.getWeight() / 20);
        System.out.println("Мурка поела и её вес составил " + murka.getWeight() + " грамм");
        musya.feed(musya.getWeight() / 20);
        System.out.println("Муся поела и её вес составил " + musya.getWeight() + " грамм");
        System.out.println();
        while (murzik.getStatus() != "Exploded")
        {
            murzik.feed(murzik.getWeight() / 20);
        }
        System.out.println("Мурзик взорвался");
        Cat.setCountDead();
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println();
        while (barsik.getStatus() != "Dead")
        {
            barsik.meow();
        }
        System.out.println("Барсик замяукал до смерти");
        Cat.setCountDead();
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println();
        kuzya.feed(150.0);
        System.out.println("Кузя поел");
        kuzya.pee();
        kuzya.pee();
        kuzya.pee();
        System.out.println("Кузя съел " + kuzya.getSumFeed() + " грамм корма");
        System.out.println();
        murka.isAlive();  // Проверка, жива ли кошка
        murka.feed(150.0);
        murka.drink(25.0);
        murka.meow();
        murka.pee();
        System.out.println();
        murzik.isAlive();  // Проверка, жива ли кошка
        murzik.feed(150.0);
        murzik.drink(25.0);
        murzik.meow();
        murzik.pee();
        System.out.println();
        barsik.isAlive();  // Проверка, жива ли кошка
        barsik.feed(150.0);
        barsik.drink(25.0);
        barsik.meow();
        murzik.pee();
        System.out.println();
        System.out.println("Родился котенок весом " + getKitten().getWeight() + " грамм");
        System.out.println();
        System.out.println("У Персика окрас: " + ColorsCats.BLUE);
        marsik.setCatColor(ColorsCats.BLACK);
        System.out.println("Марсику установлен цвет: " + marsik.getCatColor());
        System.out.println();
        murka.setName("Мурка");
        System.out.println("Кошка " + murka.getName() + " с весом "+ murka.getWeight());
        System.out.println("originWeight = " + murka.getOriginWeight());
        System.out.println();
        Cat vasya = new Cat(murka.getWeight(), murka.getOriginWeight(), "Васька");
        System.out.println("Создана кошка " + vasya.getName() + " с весом "+ vasya.getWeight());
        System.out.println("originWeight = " + vasya.getOriginWeight());
    }
}

public class Cat {

    public static final int EYES_COUNT = 2;  // Константа количество глаз
    public static final double MIN_WEIGHT = 1000; // Константа минимальный вес
    public static final double MAX_WEIGHT = 9000; // Константа максимальный вес
    private static int count;
    private ColorsCats color;

    public ColorsCats getCatColor()
    {
        return color;
    }

    public void setCatColor(ColorsCats color)
    {
        this.color = color;
    }

    public static int getCount()
    {
        return count;
    }

    public static void setCountDead()
    {
        count--;
    }

    private String name;
    private double originWeight;
    private double weight;
    private double sumFeed;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(Double weight) {
        this();
        this.weight = weight;
    }

    public Cat (Double weight, Double originWeight, String name)
    {
        this.weight = weight;
        this.originWeight = originWeight;
        this.name = name;
    }
    public Double getOriginWeight()
    {
        return originWeight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void meow() {
        if (isAlive())
        {
            weight = weight - 1;
            // System.out.println("Meow");
        }
        else System.out.println("Мёртвая кошка не может мяукать");
    }

    public void feed(Double amount)
    {
        if (isAlive())
        {
            weight = weight + amount;
            sumFeed += amount;
        }
        else System.out.println("Мёртвая кошка не может есть");
    }
    public void drink(Double amount)
    {
        if (isAlive())
        {
             weight = weight + amount;
        }
        else System.out.println("Мёртвая кошка не может пить");
    }

    public double getSumFeed()
    {
        return sumFeed;
    }

    public void pee()
    {
        if (isAlive())
        {
            weight = weight - 100;
            System.out.println("Кошка сходила в туалет, её вес уменьшился");
        }
        else System.out.println("Мёртвая кошка не может ходить в туалет");
    }

    public Double getWeight() {
        return weight;
    }

    public boolean isAlive()
    {
        return ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT));
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";

        }
    }
}

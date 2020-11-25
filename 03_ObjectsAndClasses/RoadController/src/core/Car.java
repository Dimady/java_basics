package core;

public class Car
{
    private String number;   // Переменная number типа строки - номер автомобиля
    private int height;      // Переменная height целочисленного типа - высота автомобиля
    private double weight;   // Переменная weight числового значения с плавающей точкой - вес автомобиля
    private boolean hasVehicle; // Переменная hasVehicle логического типа - у автомобиля имеется прицеп
    private boolean isSpecial; // Переменная isSpecial логического типа - автомобиль является спецтранспортом

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {

        this.number = number;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public boolean getHasVehicle()
    {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }

    public boolean getIsSpecial()
    {
        return isSpecial;
    }

    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }


    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}
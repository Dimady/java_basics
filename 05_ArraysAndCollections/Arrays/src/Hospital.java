public class Hospital {
    static final int K = 30; // Количество пациентов
    static float TEMP_MIN = (float) 36.2; // Минимальная температура
    static float TEMP_MAX = (float) 36.9; // Максимальная температура
    public static void main(String[] args) {
        float [] temperature = new float[K];
        double s = 0.0;
        int count = 0;
        for (int i = 0; i < temperature.length; i++)
        {
            temperature[i] = (float) (32 + (8 * Math.random()));
            System.out.printf("%.1f ",temperature[i]);
            if (temperature[i] >= TEMP_MIN && temperature[i] <= TEMP_MAX) count++;
            s += temperature[i];
        }
        System.out.println();
        System.out.printf("Среднее значение температуры: %.1f\n", s / K);
        System.out.println("Количество здоровых пациентов: " + count);
    }
}

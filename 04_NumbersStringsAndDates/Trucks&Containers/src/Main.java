import java.util.Scanner;
public class Main {

final static int TRUCK_CAPACITY = 12;
final static int CONTAINER_CAPACITY = 27;
final static int TRUCK_BOXES_CAPACITY = TRUCK_CAPACITY * CONTAINER_CAPACITY;
static int boxes;
static int countTruck = 1;
static int countContainer = 1;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
           System.out.println("Введите количество ящиков: ");
           boxes = scanner.nextInt();
        }  while (boxes <= 0);
        System.out.println("Грузовик " + countTruck);
        System.out.println(" Контейнер " + countContainer);
         for (int i = 1; i <= boxes; i++) {
             System.out.println("  Ящик " + i);
             if ((i % TRUCK_BOXES_CAPACITY == 0) && (i < boxes))
             {
                countTruck++;
                System.out.println("Грузовик " + countTruck);
             }
             if ((i % CONTAINER_CAPACITY == 0) && (i < boxes))
             {
                countContainer++;
                System.out.println(" Контейнер " + countContainer);
             }
         }
        System.out.println();
        System.out.println("Необходимо грузовиков: " + countTruck);
        System.out.println("Необходимо контейнеров: " + countContainer);
    }
}

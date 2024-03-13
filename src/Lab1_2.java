import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        int x = scanner.nextInt();

        System.out.print("Введіть значення z: ");
        int z = scanner.nextInt();

        int y = (x == 5) ? (3 * x + x * z) :
                ((x == -5 && z != 7) ? ((2 * x * z) / (7 - z)) : x);

        if (x == -5 && z == 7) {
            System.out.println("Помилка: Знаменник не може дорівнювати 0.");
            return;
        }

        System.out.println("Результат: y = " + y);
    }
}

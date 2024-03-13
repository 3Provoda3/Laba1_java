import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        int x = scanner.nextInt();

        System.out.print("Введіть значення z: ");
        int z = scanner.nextInt();

        int y;

        if (x == 5) {
            y = 3 * x + x * z;
        } else if (x == -5) {
            if (z != 7) {
                y = (2 * x * z) / (7 - z);
            } else {
                System.out.println("Помилка: Знаменник не може дорівнювати 0.");
                return;
            }
        } else {
            y = x;
        }

        System.out.println("Результат: y = " + y);
    }
}

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення координат кола та точки
        System.out.println("Введіть координати центра кола (x0, y0): ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        System.out.println("Введіть радіус кола R: ");
        double R = scanner.nextDouble();
        System.out.println("Введіть координати точки A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Визначення відстані між точкою та центром кола
        double distance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));

        // Перевірка умови
        if (distance < R) {
            System.out.println("Точка знаходиться всередині кола.");
        } else if (distance > R) {
            System.out.println("Точка знаходиться поза межами кола.");
        } else {
            System.out.println("Точка знаходиться на колі.");
        }

        scanner.close();
    }
}

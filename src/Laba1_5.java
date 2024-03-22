import java.util.InputMismatchException;
import java.util.Scanner;
public class Laba1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Введення значень x, y, z
            System.out.println("Введіть значення x: ");
            int x = scanner.nextInt();
            System.out.println("Введіть значення y: ");
            int y = scanner.nextInt();
            System.out.println("Введіть значення z: ");
            int z = scanner.nextInt();

            //Перевірув допустимості вхідних параметрів
            if (x <= 0 || z == 0 || (y * x * x - 14 * z) < 0) {
                throw new ArithmeticException("Для заданих значень параметрів виникає недопустима операція.");

            }

            //Обчислення значення функції
            double a = Math.sqrt(x * x * y - 24 * z);
            String formattedResult = String.format("%.2f", a);

            //Виведення результату
            System.out.println("Значення функції a = " + formattedResult );
        } catch (InputMismatchException e) {
            System.out.println("Введено  неправильні дані. Потрібно вести цілі числа. ");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Запитати користувача про порядковий номер місяця
        System.out.println("Введіть порядковий номер місяця (1-12): ");
        int month = scanner.nextInt();

        //Визначення пори року залежно від введеного значення
        String season;
        switch (month) {
            case 12:
                case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "осінь";
                break;
            default:
                season = "невідома пора року";
                break;
        }

        //Виведення пори року
        System.out.println("Пора року: " + season);

        scanner.close();

    }
}

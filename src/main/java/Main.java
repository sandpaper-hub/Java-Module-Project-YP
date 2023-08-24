import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCount = 0;
        System.out.println("На сколько человек необходимо разделить счёт?");
        while (personCount <= 1) {
            if (scanner.hasNextInt()) {
                personCount = scanner.nextInt();
                if (personCount <= 1) {
                    System.out.println("Нет смысла делить счет");
                }
            }else {
                System.out.println("Неверный формат данных");
                scanner.next();
            }
        }
        System.out.println(personCount);
    }
}
import java.util.Scanner;

public class PeopleCounter {

    int readPeopleCount(Scanner scanner) {
        int count;
        System.out.println("На сколько человек необходимо разделить счёт?");
        while (true) {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count <= 1) {
                    System.out.println("Нет смысла делить счет");
                } else {
                    scanner.nextLine();
                    return count;
                }
            } else {
                System.out.println("Неверный формат данных");
                scanner.next();
            }
        }
    }
}

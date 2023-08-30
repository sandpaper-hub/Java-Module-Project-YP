import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeopleCounter peopleCounter = new PeopleCounter();
        Calculator calculator = new Calculator();
        int people = peopleCounter.readPeopleCount(scanner);
        calculator.addNewProduct(scanner);
        calculator.printProductList(people);
    }
}
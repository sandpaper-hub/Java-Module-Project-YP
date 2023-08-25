import java.util.Scanner;

public class Calculator {
    StringBuilder productList = new StringBuilder();
    double productListPrice;
    String productName;

    void addNewProduct(Scanner scanner) {
        while (true) {
            Product product = new Product();
            readProductName(scanner, product);
            if (productName.equalsIgnoreCase("завершить")) {
                break;
            }
            readProductPrice(scanner, product);
            productList.append(product.name).append("\n");
            calculateTotalPrice(product);
            System.out.println("Товар " + product.name + " успешно добавлен.\n" +
                    "Хотите добавить ещё товар?");
        }
    }

    private void readProductName(Scanner scanner, Product product) {
        System.out.println("Введите название товара:");
        productName = scanner.next();
        if (!productName.equalsIgnoreCase("завершить")) {
            product.name = productName;
        }
    }

    private void readProductPrice(Scanner scanner, Product product) {
        System.out.println("Введите стоимость товара:");
        while (true) {
            if (scanner.hasNextDouble()) {
                product.price = scanner.nextDouble();
                break;
            } else {
                System.out.println("Не корректные данные.");
                scanner.next();
            }
        }
    }

    private void calculateTotalPrice(Product product) {
        productListPrice += product.price;
    }
}

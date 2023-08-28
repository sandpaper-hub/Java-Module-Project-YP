import java.util.Scanner;

public class Calculator {
    StringBuilder productList = new StringBuilder("Добавленные товары:");
    double productListPrice;
    String productName;
    double productPrice;

    private void readProductName(Scanner scanner, Product product) {
        System.out.println("Введите название товара:");
        productName = scanner.nextLine();
        if (!productName.equalsIgnoreCase("завершить")) {
            product.name = productName;
        }
    }

    private void readProductPrice(Scanner scanner, Product product) {
        System.out.println("Введите стоимость товара:");
        while (true) {
            if (scanner.hasNextDouble()) {
                productPrice = scanner.nextDouble();
                if (!(productPrice <= 0)) {
                    product.price = productPrice;
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Цена не может быть отрицательной или нулевой, введите снова");
                }

            } else {
                System.out.println("Не корректные данные.");
                scanner.next();
            }
        }
    }

    private void calculateTotalPrice(Product product) {
        productListPrice += product.price;
    }

    void addNewProduct(Scanner scanner) {
        while (true) {
            Product product = new Product();
            readProductName(scanner, product);
            if (productName.equalsIgnoreCase("завершить")) {
                break;
            }
            readProductPrice(scanner, product);
            productList.append("\n").append(product.name);
            calculateTotalPrice(product);
            System.out.println("Товар " + product.name + " успешно добавлен.\n" +
                    "Хотите добавить ещё товар?");
        }
    }

    void printProductList(PriceFormatter formatter, int people) {
        String roundedPrice = formatter.roundPrice(productListPrice / people);
        System.out.println(productList.toString());
        System.out.println("С каждого человека " + roundedPrice + formatter.rubInflection(productListPrice / people));
    }
}

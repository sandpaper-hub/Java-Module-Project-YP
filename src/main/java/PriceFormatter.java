public class PriceFormatter {
    String roundPrice(double price) {
        return String.format("%.2f", price);
    }

    String rubInflection(double price) {
        if (price % 10 == 1 && price % 100 != 11) {
            return " рубль";
        } else if (price % 10 >= 2 && price % 10 <= 4 && (price % 100 < 10 || price % 100 >= 20)) {
            return " рубля";
        } else {
            return " рублей";
        }
    }
}

public class TypeCasting {

    public static void main(String[] args) {
        int number = 25;
        double convertedNumber = number;

        System.out.println("Original int value: " + number);
        System.out.println("Converted double value: " + convertedNumber);

        System.out.println();
        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + convertedPrice);
    }
}
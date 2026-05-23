// File name: ExplicitConversionExample.java

//Type casting also known as type narrowing or explicit conversion in Java means manually converting one data type into another data type.

//Java does not do this automatically when converting a bigger type into a smaller type. You must manually convert it using casting.
public class explicitTypeConversion {

    public static void main(String[] args) {

        // double value has decimal part
        double price = 99.99;

        // double is manually converted into int
        // This is called narrowing or explicit type conversion
        int convertedPrice = (int) price;

        // Printing both values
        System.out.println("Double value: " + price);
        System.out.println("Converted int value: " + convertedPrice);
    }
}
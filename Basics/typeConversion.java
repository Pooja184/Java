// File name: TypeConversionExample.java
//Java does this automatically when converting a smaller type into a bigger type.
public class typeConversion{

    public static void main(String[] args) {

        // int value
        int marks = 85;

        // int is automatically converted into double
        // This is called widening or implicit type conversion
        double convertedMarks = marks;

        // Printing both values
        System.out.println("Integer value: " + marks);
        System.out.println("Converted double value: " + convertedMarks);
    }
}
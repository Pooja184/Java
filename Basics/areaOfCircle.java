// Importing all utility classes from java.util package
// Scanner class is used for taking user input
import java.util.*;

// Public class declaration
// File name must be areaOfCircle.java
public class areaOfCircle {

    // Main method - execution starts from here
    public static void main(String args[]) {

        // Creating Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        // Reading radius value entered by user
        float radius = sc.nextFloat();

        // Calculating and printing area of circle
        // Formula: π × r × r
        // 'f' is used to specify float value
        System.out.println(3.14f * radius * radius);

        // Closing scanner object
        sc.close();
    }
}
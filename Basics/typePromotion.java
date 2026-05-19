//java automaticaally promotes smaller data types to larger data types during arithmetic operations to prevent data loss. This is known as type promotion. In the example below, we have a byte variable 'a' which is promoted to an int during the multiplication operation, resulting in an int value. To store this result back into a byte variable, we need to perform explicit type casting.

public class typePromotion {
    public static void main(String[] args) {  
            byte a=5;
            // byte b=a*2; //error because 5*2 is int and we are trying to store it in byte
            //to solve this we can do type casting
            byte c=(byte)(a*2); //type casting
            System.out.println(c);
    }
}   
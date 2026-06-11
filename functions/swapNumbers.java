public class swapNumbers{
    public static void main(String[] args) {
        swap(2, 3);
    }
    public static void swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }
}
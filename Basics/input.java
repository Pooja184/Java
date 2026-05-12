import java.util.*;
//learn how to take input in java 
public class input{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // String input1= sc.next(); // this line capture text till space ex. john Doe. It will only print John
                                // here if we want to take full line we can simply use sc.nextLine instead of sc.next()
        // System.out.println(input1);

        String input2=sc.nextLine();
        System.out.println(input2);

        int input3=sc.nextInt();
        System.out.println(input3);

         float input4=sc.nextFloat();
        System.out.println(input4);
    }
}
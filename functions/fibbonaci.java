
public class fibbonaci {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        int range = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i <= range; i++) {

            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

// a=0 , 1
// b=1, 1,
// next = 1
// ans= 0 

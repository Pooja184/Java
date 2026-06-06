public class hallowRectangle{
    public static void main(String[] args) {
        int range=4;
        for(int i=1;i<=range;i++){
            for(int j=i;j<range;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.err.println();
        }
    }
}
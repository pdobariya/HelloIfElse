public class InterChangeValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println(" A Value = " +a);
        System.out.println(" B Value = " +b);


    }
}

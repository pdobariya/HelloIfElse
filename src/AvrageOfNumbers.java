import java.util.Scanner;

public class AvrageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter The Number");
        int a = sc.nextInt();
        System.out.printf("Enter The Number Again");
        int b = sc.nextInt();
        System.out.printf("Enter The Number Again");
        int c = sc.nextInt();
        System.out.printf("Enter The Number Again");
        int d = sc.nextInt();
        System.out.printf("Enter The Number Again");
        int e = sc.nextInt();

        int x = a+b+c+d+e;
        System.out.println("Total :-" +x);
        System.out.println("Avarage Of 5 :-" +x/5);




    }
}

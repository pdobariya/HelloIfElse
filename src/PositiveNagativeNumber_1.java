import java.util.Scanner;

public class PositiveNagativeNumber_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter The Number");
        int x = sc.nextInt();

        if (x == 0){
            System.out.printf("This Number Is ZERO");
        }
        if (x < 0){
            System.out.printf("This Number Is NAGATIVE");
        }
        if (x > 0){
            System.out.printf("This Number Is POSITIVE");
        }
    }
}

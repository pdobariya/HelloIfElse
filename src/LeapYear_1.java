import java.util.Scanner;

public class LeapYear_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter The Year");
        int a = sc.nextInt();

        if (a%4==0){
            System.out.printf("This Year Is Leap Year");
        }
        else {
            System.out.printf("This Year Is Not Leap Year");
        }
    }

}

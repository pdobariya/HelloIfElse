import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The NUmber 1 To 7");
        int a = sc.nextInt();


        if (a == 1){
            System.out.println("MONDAY");
        }
        else if (a==2){
            System.out.println("TUESDAY");
        }
        else if (a==3){
            System.out.println("WEDNUSDAY");
        }
        else if (a==4){
            System.out.println("THUSDAY");
        }
        else if (a==5){
            System.out.println("FRIDAY");
        }
        else if (a==6){
            System.out.println("SATERDAY");
        }
        else if (a==7){
            System.out.println("SUNDAY");
        }
    }
}

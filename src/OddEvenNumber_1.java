import java.util.Scanner;

public class OddEvenNumber_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Add Any Number");
        int a = sc.nextInt();


        if (a%2==0){
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");
        }




    }
}

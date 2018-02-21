import java.util.Scanner;

public class Student_Result {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Student Percentage");
        int per = scanner.nextInt();

        if (per>=35){
            System.out.println("PASS");
        }
        else {
            System.out.println("Fail");
        }
    }
}

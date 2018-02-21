import java.util.Scanner;

public class AgeForVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the HIS/HER Age ");
        int age = scanner.nextInt();
        if (age >= 100){
            System.out.println("Age IS wrong ,PLzz enter right age and Try again ");
        }
        else if (age >= 18){
            System.out.println("You Are Illigible For Vote");
        }

        else if (age > 18){
            System.out.println("You Are Noy Illigible For Vote");

        }
    }
}

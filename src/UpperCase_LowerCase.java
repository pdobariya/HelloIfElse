import java.util.Scanner;

public class UpperCase_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;
        System.out.println("Enter Any Lowercase Alphabet");
        char ch = sc.next().charAt(0);

       temp = (int)ch;
       temp = temp+32;
       ch = (char)temp;
        System.out.println("Lower Case Is  " +ch);
    }
}

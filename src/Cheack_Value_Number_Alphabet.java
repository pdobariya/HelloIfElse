import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Cheack_Value_Number_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value");
        char ch = sc.next().charAt(0);
       // int in=sc.nextInt();
       // String st=sc.next();

        if ((ch>='a' && ch<='z')||(ch>='A' && ch <='Z')){
            System.out.println("This Is AlphaBet  " +ch);
        }
       else if (ch>=0&&ch<=9){
            System.out.println("This Is Number  " +ch);
        }

        else {
             System.out.println("This Is Symbol  " +ch);
        }

    }
}

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Symbol +,-,/,*");
       char x=sc.next().charAt(0);
        int a = 10;
        int b = 2;
      if (x=='+'){
          System.out.println(a+b);
      }
      else if (x=='-'){
          System.out.println(a-b);
      }
      else if (x=='*'){
          System.out.println(a*b);
      }
      else if (x=='/'){
          System.out.println(a/b);
      }
      else {
          System.out.println("NO VALUE");
      }
    }
}

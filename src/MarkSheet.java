import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter The Student Name");
        String name = sc.next();
        System.out.printf("Enter The Roll Number");
        int b = sc.nextInt();
        System.out.printf("Enter The Maths Subject Mark ");
        int c = sc.nextInt();
        System.out.printf("Enter The Science Subject Mark");
        int d = sc.nextInt();
        System.out.printf("Enter The English Subject Mark");
        int e = sc.nextInt();

        int total = c+d+e;
        System.out.println("total  =" +total);
        float percentage = total*100/300;
        System.out.println(percentage);
        if (percentage >= 35){
            System.out.println("pass");
        }
        if (percentage < 35 ){
            System.out.println("fail");
        }
       else if (percentage >= 80){
            System.out.println("Grade A+");
        }
      else   if (percentage >= 60){
            System.out.println("Grade A");
        }
       else if (percentage >=50){
            System.out.println("Grade B");
        }
        else if (percentage >= 35){
            System.out.println("Grade C");
        }
        else {
            System.out.println("No Grade");
        }


    }
}

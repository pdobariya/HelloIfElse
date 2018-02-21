import java.util.Scanner;

public class Sales_Id_Salary_Comission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sellers Id");
        int id = sc.nextInt();
        System.out.println("Enter The Sellers Name");
        String name = sc.next();
        System.out.println("Enter The Sellers Amount");
        int amut = sc.nextInt();
        System.out.println("Enter The Basic Salary");
        int slry = sc.nextInt();
        if (amut >= 50000){
            System.out.println("Sales Commission 35 % = "  +amut*35/100);
        }
        if (amut >= 30000){
            System.out.println("Sales Commission 20 % = " +amut*20/100);
        }
        else if (amut >= 20000){
            System.out.println("Sales Commission 10 % = " +amut*10/100);
        }
        else if (amut >= 10000){
            System.out.println("Sales Commission 5 % = " +amut*5/100);
        }
        else if (amut <10000){
            System.out.println("Sales Commission 2 % = " +amut*2/100);
        }


    }
}

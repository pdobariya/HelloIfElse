import java.util.Scanner;

public class EmployeeIdSallary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id number");
        int id = sc.nextInt();
        System.out.println("Enter The Employee Name");
        String name = sc.next();
        System.out.println("Enter The Employes basic Salary");
        int s = sc.nextInt();
        int Hra = s*10/100;
        System.out.println("hra  " +Hra);
        int DA = s*8/100;
        System.out.println("DA   " +DA);
        int TA = s*9/100;
        System.out.println("TA   " +TA);
        int PF = s*20/100;
        System.out.println("PF   "+PF);
        int GR = s+Hra+DA+TA+PF;
        System.out.println("Gross Salary  "+GR);

    }
}

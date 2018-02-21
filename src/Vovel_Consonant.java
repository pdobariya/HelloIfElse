import java.util.Scanner;

public class Vovel_Consonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Character");
        char ch=sc.next().charAt(0);
        if ((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U')){
            System.out.println("This Case IS Vowel  "+ch);
        }
        else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("This Character is Consonant  "+ch);
        }
        else {
            System.out.println("Error massage");
        }
    }
}

import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Any Alfabet");
         char abc = scanner.next().charAt(0);
         char x;
         String cityname1 = null;
        if (abc == 'a' || abc == 'A'){
            cityname1 = "AHMDAVAD";
        }
        else if (abc == 'b' || abc == 'B'){
            cityname1 = "BOMBAY";
        }
        else if (abc == 'c' || abc == 'C'){
            cityname1 = "CANADA";
        }
        else if (abc == 'd' || abc == 'D'){
            cityname1 = "DELHI";
        }
        else if (abc == 'e' || abc == 'E'){
            cityname1 = "ENGLAND";
        }
        else if (abc == 'f' || abc == 'F'){
            cityname1 = "FRANCE";
        }
        System.out.println(cityname1);
        }
}

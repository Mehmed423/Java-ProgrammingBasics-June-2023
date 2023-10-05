import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=Double.parseDouble(scanner.nextLine());
        double b=2.54;
        double centimeters=a*b;
        System.out.println(centimeters);
    }
}

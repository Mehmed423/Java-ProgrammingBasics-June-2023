import java.util.Scanner;
 
public class Converter {
 
    public static void main(String[] args) {
      
        // 1. Четем от конзолата
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
 
        // 2. Умножаваме прочетеното по 1.79549 за да превърнем в български лев
        double bgn = usd * 1.79549;
 
        // 3. Принтираме резултата
        System.out.println(bgn);
    }
 
}

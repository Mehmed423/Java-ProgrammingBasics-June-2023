package whileLoop;
 
import java.util.Scanner;
 
public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
        double sum = 0;
        double increase = 0;
 
        while (!input.equals("NoMoreMoney")) {
            increase = Double.parseDouble(input);
            if(increase < 0) {
                break;
            }
 
            System.out.printf("Increase: %.2f%n", increase);
            sum+= increase;
 
            input = scanner.nextLine();
        }
 
        if(increase < 0) {
            System.out.println("Invalid operation!");
        }
        
        System.out.printf("Total: %.2f", sum);
    }
}

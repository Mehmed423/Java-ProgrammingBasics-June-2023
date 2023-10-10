package advancedConditionalStatements;
 
import java.util.Scanner;
 
public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        double age = Double.parseDouble(scanner.nextLine());
        String pol = scanner.nextLine();
    
        if (pol.equals("f")) {
            if(age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else if (pol.equals("m")){
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        }
    }
}

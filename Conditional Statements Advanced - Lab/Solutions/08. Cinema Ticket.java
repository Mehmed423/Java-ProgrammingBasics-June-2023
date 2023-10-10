package advancedConditionalStatements;
 
import java.util.Scanner;
 
public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String dayOfWeek = scanner.nextLine();
 
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            case "Sunday":
            case "Saturday":
                System.out.println(16);
                break;
        }
    }
}

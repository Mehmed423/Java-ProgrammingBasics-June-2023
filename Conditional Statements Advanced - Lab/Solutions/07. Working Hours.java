package advancedConditionalStatements;
 
import java.util.Scanner;
 
public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int hourOfDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
 
        boolean isWorkingOfficeDay = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday") ||
                dayOfWeek.equals("Saturday");
 
        boolean isWorkingHour = hourOfDay >= 10 && hourOfDay <=18;
 
        if(isWorkingOfficeDay && isWorkingHour) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
 
}

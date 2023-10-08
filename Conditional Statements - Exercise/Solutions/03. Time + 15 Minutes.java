import java.util.Scanner;
 
public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене на вход
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
 
        // 2. Преврщаме всичко в минути и добавяме допълнителните 15 минути
        int totalMinutes = minutes + 15 + (hours * 60);
 
        // 3. Изчисляваме часове:минути
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
 
        // 4. Проверяваме дали часовета са повече от 23
        if (hours > 23) {
            hours = 0;
        }
 
        // 5. Принтираме
        System.out.printf("%d:%02d", hours, minutes);
    }
}

import java.util.Scanner;
 
public class SumSeconds {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене на вход
        int firstPlayerSeconds = Integer.parseInt(scanner.nextLine());
        int secondPlayerSeconds = Integer.parseInt(scanner.nextLine());
        int thirdPlayerSeconds = Integer.parseInt(scanner.nextLine());
 
        // 2. Изчисление
        int totalSeconds = firstPlayerSeconds + secondPlayerSeconds + thirdPlayerSeconds;
 
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
 
        // 3. Принтиране на конзолата
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
 
    }
}

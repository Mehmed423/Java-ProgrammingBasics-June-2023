import java.util.Scanner;
 
public class RadiansToDegrees {
    public static void main(String[] args) {
        // 1. Четене от конзолата
        Scanner scanner = new Scanner(System.in);
        double angleInRadians = Double.parseDouble(scanner.nextLine());
 
        // 2. Изчисление | градус = радиан * 180 / π
        double angleInDegrees = angleInRadians * 180 / Math.PI;
 
        // 3. Принтиране на конзолата
        System.out.println(angleInDegrees);
    }
}

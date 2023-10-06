import java.util.Scanner;
 
public class FishTank {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене от конзолата
        
        //Дължина в см – цяло число в интервала [10 … 500]
        int length = Integer.parseInt(scanner.nextLine());
        
        //Широчина в см – цяло число в интервала [10 … 300]
        int width = Integer.parseInt(scanner.nextLine());
        
        //Височина в см – цяло число в интервала [10… 200]
        int height = Integer.parseInt(scanner.nextLine());
        
        //Процент  – реално число в интервала [0.000 … 100.000]
        double percent = Double.parseDouble(scanner.nextLine());
 
        // 2. Изчисление
        int volumeInCm = length * width * height;
        double volumeInLiters = volumeInCm / 1000.0;
 
        // Изчисляваме чистият обем вода
        // Използваме същата променлива, като я презаписваме
        volumeInLiters = volumeInLiters - (volumeInLiters * (percent / 100));
 
        // 3. Принтиране
        System.out.println(volumeInLiters);
    }
}

import java.util.Scanner;
 
public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        //Ценоразпис:
        //Пакет химикали - 5.80 лв.
        //Пакет маркери - 7.20 лв.
        //Препарат - 1.20 лв (за литър)
 
        // 1.0. Входни данни:
        //Брой пакети химикали - цяло число в интервала [0...100]
        //Брой пакети маркери - цяло число в интервала [0...100]
        //Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //Процент намаление - цяло число в интервала [0...100]
 
        // 1.1. Четене от конзолата
        int pencilPackages = Integer.parseInt(scanner.nextLine());
        int markerPackages = Integer.parseInt(scanner.nextLine());
        int cleanerLiters = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
 
        // 2. Изчисление
        double materialPrice = (pencilPackages * 5.80) + (markerPackages * 7.20) + (cleanerLiters * 1.20);
        double discount = materialPrice * (percentDiscount / 100.0);
 
        // 3. Принтиране
        System.out.println(materialPrice - discount);
    }
}

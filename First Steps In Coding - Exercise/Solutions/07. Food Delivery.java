import java.util.Scanner;
 
public class FoodDelivery {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        //Ценоразпис:
        //Пилешко меню –  10.35 лв.
        //Меню с риба – 12.40 лв.
        //Вегетарианско меню  – 8.15 лв.
 
        // 1. Четене от конзолата
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());
 
        // 2. Изчисление
        double menusPrice = (chickenMenus * 10.35) + (fishMenus * 12.40) + (vegetarianMenus * 8.15);
        double desertPrice = menusPrice * 0.20;
 
        double totalPrice = menusPrice + desertPrice + 2.50;
 
        // 3. Принтиране
        System.out.println(totalPrice);
 
    }
}

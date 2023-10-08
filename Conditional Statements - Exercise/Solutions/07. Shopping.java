import java.util.Scanner;
 
public class Shopping {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
 
        /*
        Видеокарта – 250 лв./бр.
        Процесор – 35% от цената на закупените видеокарти/бр.
        Рам памет – 10% от цената на закупените видеокарти/бр.
         */
 
        double videoCardPrice = videoCards * 250;
        double processorPrice = (videoCardPrice * 0.35) * processors;
        double ramPrice = (videoCardPrice * 0.10) * ram;
 
        double totalPrice = videoCardPrice + processorPrice + ramPrice;
 
        if (videoCards > processors){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (budget >= totalPrice){
            System.out.printf("You have %.02f leva left!", budget - totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.02f leva more!", totalPrice - budget);
        }
    }
}

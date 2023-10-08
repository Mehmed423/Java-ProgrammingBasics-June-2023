import java.util.Scanner;
 
public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        double budget = Double.parseDouble(scanner.nextLine());
 
        int actors = Integer.parseInt(scanner.nextLine());
        double costumePricePerActor = Double.parseDouble(scanner.nextLine());
 
        //Декорът за филма е на стойност 10% от бюджета.
        double decor = budget * 0.10;
 
        //При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        double costumesPrice = actors * costumePricePerActor;
        if (actors > 150) {
            costumesPrice = costumesPrice - (costumesPrice * 0.10);
        }
 
        double moviePrice = decor + costumesPrice;
 
        if (moviePrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moviePrice - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moviePrice);
        }
 
 
    }
}

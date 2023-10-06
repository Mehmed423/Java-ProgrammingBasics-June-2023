import java.util.Scanner;
 
public class BasketballEquipment {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене от конзолата
        double annualFee = Double.parseDouble(scanner.nextLine());
 
        // 2. Изчисление
 
        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
 
        double sneakersPrice = annualFee - (annualFee * 0.40);
        double suitPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = suitPrice / 4;
        double accessoriesPrice = ballPrice / 5;
 
        double totalSum = annualFee + sneakersPrice + suitPrice + ballPrice + accessoriesPrice;
 
        // 3. Принтиране
        System.out.println(totalSum);
    }
}

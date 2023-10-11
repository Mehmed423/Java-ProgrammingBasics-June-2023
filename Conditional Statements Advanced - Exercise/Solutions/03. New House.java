import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String flowers = scan.nextLine();
        int countFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0.00;

        switch (flowers) {
            case "Roses":
                price = countFlowers * 5;
                if (countFlowers >= 80) {
                    price = price - (price * 10 / 100);
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers >= 90) {
                    price = price - (price * 15 / 100);
                }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers >= 80) {
                    price = price - (price * 15 / 100);
                }
                break;
            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers < 80) {
                    price = price + (price * 0.20);
                }
                break;

        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - price));
        }
    }
}

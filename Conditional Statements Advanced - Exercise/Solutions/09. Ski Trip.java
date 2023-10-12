import java.util.Scanner;
 
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int days = Integer.parseInt(scanner.nextLine());
        String typeRest = scanner.nextLine();
        String rating = scanner.nextLine();
 
        double priceRoomForOne = (days - 1) * 18.00;
        double priceApt = (days - 1) * 25.00;
        double pricePresidentApt = (days - 1) * 35.00;
        double finalPrice = 0.0;
 
        switch (typeRest) {
            case "room for one person":
                finalPrice = priceRoomForOne;
                break;
 
            case "apartment":
                if (days <= 10) {
                    finalPrice = priceApt * 0.7;
                } else if (days <= 15) {
                    finalPrice = priceApt * 0.65;
                } else if (days > 15) {
                    finalPrice = priceApt * 0.5;
                }
                break;
 
            case "president apartment":
                if (days <= 10) {
                    finalPrice = pricePresidentApt * 0.9;
                } else if (days <= 15) {
                    finalPrice = pricePresidentApt * 0.85;
                } else{
                    finalPrice = pricePresidentApt * 0.8;
                }
                break;
        }
        
        if (rating.equals("positive")) {
            finalPrice = finalPrice * 1.25;
        } else if (rating.equals("negative")) {
            finalPrice = finalPrice * 0.9;
        }
        
        System.out.printf("%.2f", finalPrice);
    }
}

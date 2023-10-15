import java.util.Scanner;
 
public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
 
        int toys = 0;
        double lilyMoney = 0.00;
        double birthdayMoney = 0.00;
 
        for (int i = 1; i <= age; i++) {
            // If the current birthday is even number Lily will earn money.
            if (i % 2 == 0) {
              birthdayMoney += 10.00;
                lilyMoney += birthdayMoney;
                lilyMoney -= 1.00;
            } else {
                // If the current birthday is odd number Lily will take toy.
                toys++;
            }
        }
 
        // Adding the money for sold toys
        lilyMoney += toys * toyPrice;
 
        if (lilyMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", lilyMoney - washingMachinePrice);
        }else {
            System.out.printf("No! %.2f", washingMachinePrice - lilyMoney);
        }
 
    }
}

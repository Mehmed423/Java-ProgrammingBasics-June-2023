import java.util.Scanner;
 
public class Cinema {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
 
        int totalSeats = rows * cols;
        double totalIncome = 0.00;
 
        //Premiere - 12.00
        //Normal - 7.50
        //Discount - 5.00
        switch (typeOfProjection) {
            case "Premiere":
                totalIncome = totalSeats * 12.00;
                break;
            case "Normal":
                totalIncome = totalSeats * 7.50;
                break;
            case "Discount":
                totalIncome = totalSeats * 5.00;
                break;
        }
 
        System.out.printf("%.2f leva", totalIncome);
 
    }
}

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count1 = Integer.parseInt(scan.nextLine());
        int count2 = Integer.parseInt(scan.nextLine());
        double dog = 2.50;
        double cat = 4.00;
        System.out.println(dog*count1 + cat*count2);
    }
}

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double kvm = meters * 7.61;
        double kvm1 = 0.18 * kvm;
        System.out.println("The final price is: " + (kvm-kvm1) + " lv.");
        System.out.println("The discount is: " + (kvm1) + " lv.");
    }
}

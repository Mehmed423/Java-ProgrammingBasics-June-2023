import java.util.Scanner;
 
public class DepositCalculator {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене от конзолата
 
        //Депозирана сума – реално число в интервала [100.00 … 10000.00]
        double depositAmount = Double.parseDouble(scanner.nextLine());
        
        //Срок на депозита (в месеци) – цяло число в интервала [1…12]
        int depositPeriod = Integer.parseInt(scanner.nextLine());
 
        //Годишен лихвен процент – реално число в интервала [0.00 …100.00]
        double depositPercent = Double.parseDouble(scanner.nextLine()) / 100;
 
        // 2. Изчисление  сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sum = depositAmount + depositPeriod * ((depositAmount * depositPercent) / 12);
 
        // 3. Печатане на конзолата
        System.out.println(sum);
 
    }
}

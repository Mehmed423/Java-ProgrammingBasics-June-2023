import java.util.Scanner;
 
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());
 
        double totalPoints = 0;
        totalPoints += initialPoints;
 
        for (int i = 0; i < judgesCount; i++) {
 
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
 
            //дължината на името * точките / две
            totalPoints += judgeName.length() * judgePoints / 2;
 
            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                return;
            }
 
        }
 
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
 
    }
}

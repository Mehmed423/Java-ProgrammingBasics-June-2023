import java.util.Scanner;
 
public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int goal = 10000;
        int totalWalkedSteps = 0;
 
        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
 
            int steps = Integer.parseInt(input);
            totalWalkedSteps += steps;
 
            if (totalWalkedSteps >= goal) {
                break;
            }
 
            input = scanner.nextLine();
        }
 
        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalWalkedSteps += stepsToHome;
        }
 
        if (totalWalkedSteps >= goal) {
            //Goal reached! Good job!
            //%d steps over the goal!
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalWalkedSteps - goal);
        } else {
            //%d more steps to reach goal.
            System.out.printf("%d more steps to reach goal.", goal - totalWalkedSteps);
        }
 
    }
}

import java.util.Scanner;
 
public class EvenPowers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //четни степени: 0 до n
        //повтаряме: отпечатвам 2 на степен
        //начало: 0
        //край: n
        //промяна: +2
 
        for (int step = 0; step <= n; step += 2) {
            System.out.printf("%.0f%n",Math.pow(2, step));
        }
    }
}

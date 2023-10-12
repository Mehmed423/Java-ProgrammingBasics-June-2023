import java.util.Scanner;
 
public class Numbers1toNOver3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
 
        //1 до n през 3
        //for цикъл
        //повтаряме: отпечатваме
        //начало: 1
        //край: n
        //промяна: +3
 
        //fori + Tab -> изписва for цикъл
        for (int number = 1; number <= n; number += 3) {
            System.out.println(number);
        }
 
    }
}

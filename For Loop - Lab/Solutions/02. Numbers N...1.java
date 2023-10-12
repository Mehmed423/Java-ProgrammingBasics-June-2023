import java.util.Scanner;
 
public class NumbersNto1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
 
        //n до 1
        //for цикъл
        //повтаряме: отпечатваме число
        //начало: n
        //край: 1
        //промяна: -1
 
        for (int number = n; number >= 1; number--) {
            System.out.println(number);
        }
    }
}

import java.util.Scanner;
 
public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = Integer.parseInt(scanner.nextLine()); //брой на числата
 
        int sum = 0; //сумата на въведените числа
 
        //повтаряме: въвеждаме стойност на числото + сумираме
        //начало: първото число (1)
        //край: последното число (n)
        //промяна: +1
 
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }
 
        System.out.println(sum);
    }
}

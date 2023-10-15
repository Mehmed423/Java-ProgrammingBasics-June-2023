import java.util.Scanner;
 
public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());//брой числата
        //всяко едно число от 1-вото до последното (countNumbers)
 
        //начална стойност: 1 (първото число)
        //крайна стойност: countNumbers (последното число)
        //промяна: + 1
        //повтаряме: четем стойност
 
        int max = Integer.MIN_VALUE; //възможно най-малко
        int min = Integer.MAX_VALUE; //възмоцно най-голямата
        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            //проверка дали моето число е максимално
            if (value > max) {
                max = value;
            }
            //проверка дали моето число е минимално
            if (value < min) {
                min = value;
            }
 
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
 
 
    }
}

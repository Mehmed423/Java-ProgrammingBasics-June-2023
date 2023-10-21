import java.util.Scanner;
 
public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
 
        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {
 
            String textNumber = "" + currentNumber;
            //String number2 = String.valueOf(currentNumber);
            //String number3 = Integer.toString(currentNumber);
            int evenPositionSum = 0;
            int oddPositionSum = 0;
 
            for (int position = 0; position < textNumber.length(); position++) {
 
                int digit = Integer.parseInt(textNumber.charAt(position) + "");
 
                if (position % 2 == 0) {
                    evenPositionSum += digit;
                } else {
                    oddPositionSum += digit;
                }
            }
 
            if (oddPositionSum == evenPositionSum) {
                System.out.print(currentNumber + " ");
            }
        }
 
 
    }
}

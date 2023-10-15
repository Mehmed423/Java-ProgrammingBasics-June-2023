import java.util.Scanner;
 
public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase(); //въведен текст изцяло с малки букви
        int sum = 0; //сума от гласните букви
 
        for (int position = 0; position <= text.length() - 1; position++) {
            char currentLetter = text.charAt(position);
            //проверка дали е гласна -> a, e, i, o, u
            switch (currentLetter) {
                case 'a':
                    //1
                    sum += 1;
                    break;
                case 'e':
                    //2
                    sum += 2;
                    break;
                case 'i':
                    //3
                    sum += 3;
                    break;
                case 'o':
                    //4
                    sum += 4;
                    break;
                case 'u':
                    //5
                    sum += 5;
                    break;
            }
        }
 
        System.out.println(sum);
    }
}

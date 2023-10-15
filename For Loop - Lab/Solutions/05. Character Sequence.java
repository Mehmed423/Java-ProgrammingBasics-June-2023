import java.util.Scanner;
 
public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
 
        //позиции: 0 до последната (дължина - 1)
        //повтаряме: отпечатвам символа на дадената позиция
        //начало: 0
        //край: дължина - 1
        //промяна: +1
 
        for (int position = 0; position <= text.length() - 1; position++) {
            System.out.println(text.charAt(position));
        }
 
    }
}

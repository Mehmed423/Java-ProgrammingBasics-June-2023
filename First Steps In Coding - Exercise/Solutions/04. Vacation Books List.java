import java.util.Scanner;
 
public class VacationBooksList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Четене от конзолата
 
        //Брой страници в текущата книга – цяло число в интервала [1…1000]
        int numberOfPages = Integer.parseInt(scanner.nextLine());
 
        //Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
 
        //Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        int days = Integer.parseInt(scanner.nextLine());
 
        // 2. Изчисление
        int totalHours = numberOfPages / pagesPerHour;
        int hoursPerDay = totalHours / days;
 
        // 3. Принтиране
        System.out.println(hoursPerDay);
 
    }
}

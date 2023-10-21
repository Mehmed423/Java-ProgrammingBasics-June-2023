import java.util.Scanner;
 
public class CinemaTickets {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        int studentTickets = 0;
        int kidTickets = 0;
        int standardTickets = 0;
        int totalTickets = 0;
 
        String movieName = scanner.nextLine();
        while (!movieName.equals("Finish")) {
 
            //Прочитам колко свободни места има в залата за сегашнят филм
            int availableSeats = Integer.parseInt(scanner.nextLine());
 
            //Пазим заетите места в залата
            int takenSeats = 0;
 
            //Прочитам типовете билети за сегашният филм
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
 
                //Ще заемем едно свободно място.
                takenSeats++;
 
                // Инкрементираме общия брой продадени билети.
                totalTickets++;
                switch (ticketType) {
                    case "student":
                        // Инкрементираме общия брой продадени student билети.
                        studentTickets++;
                        break;
                    case "kid":
                        // Инкрементираме общия брой продадени kid билети.
                        kidTickets++;
                        break;
                    case "standard":
                        // Инкрементираме общия брой продадени standard билети.
                        standardTickets++;
                        break;
                }
 
                if (takenSeats == availableSeats) {
                    break;
                }
 
                ticketType = scanner.nextLine();
            }
 
            System.out.printf("%s - %.2f%% full.%n", movieName, takenSeats * 1.0 / availableSeats * 100);
 
            movieName = scanner.nextLine();
        }
 
        // Принтираме колко общо билета сме продали
        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidTickets * 1.0 / totalTickets * 100);
 
 
    }
 
}

import java.util.Scanner;

public class MovieIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameMovie = scanner.nextLine();
        int numDays = Integer.parseInt(scanner.nextLine());
        int numTickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int procentCinema = Integer.parseInt(scanner.nextLine());

        double priceTicketForDay = priceTicket * numTickets;

        double income = numDays * priceTicketForDay;
        double procent = income * (procentCinema / 100.0);
        double totalMoney = procent - income;
        System.out.printf("The profit from the movie  is %.2f lv.", totalMoney);


    }
}

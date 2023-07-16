import java.util.Scanner;


public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTicketCount = Integer.parseInt(scanner.nextLine());
        int kidsTicketCount = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double priceKids = priceAdult * 0.30;
        double adultWithService = priceAdult + priceService;
        double kidsWithService = priceKids + priceService;
        double totalTicketsPrice = (adultTicketCount * adultWithService) + (kidsTicketCount * kidsWithService);
        double result = totalTicketsPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, result);
    }
}
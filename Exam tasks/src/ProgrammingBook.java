import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double printOnePage = Double.parseDouble(scanner.nextLine());
        double printOneCover = Double.parseDouble(scanner.nextLine());
        int discountPaper = Integer.parseInt(scanner.nextLine());
        double designerSum = Double.parseDouble(scanner.nextLine());
        int teamMoney = Integer.parseInt(scanner.nextLine());

        int totalPages = 899;
        int totalCovers = 2;

        double totalPrintingCost = (totalPages * printOnePage) + (totalCovers * printOneCover);
        double discountedCost = totalPrintingCost - (totalPrintingCost * discountPaper / 100);
        double cost = discountedCost + designerSum;
        double teamPayment = (cost * teamMoney) / 100;
        double total = cost - teamPayment;

        System.out.printf("Avtonom should pay %.2f BGN.", total);
    }
}
import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocations = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numLocations; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());
            int numDays = Integer.parseInt(scanner.nextLine());

            double goldTotal = 0;
            for (int j = 0; j < numDays; j++) {
                double addedGold = Double.parseDouble(scanner.nextLine());
                goldTotal += addedGold;
            }

            double averageYield = goldTotal / numDays;

            if (averageYield >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageYield);
            } else {
                double shortfall = expectedGold - averageYield;
                System.out.printf("You need %.2f gold.%n", shortfall);
            }
        }

    }
}

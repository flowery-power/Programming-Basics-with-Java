import java.util.Scanner;

public class FoodPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int numDays = scanner.nextInt();
        double totalFood = scanner.nextDouble();

        double totalCookiesEaten = 0;
        double totalFoodEaten = 0;
        double dogFoodEaten = 0;
        double catFoodEaten = 0;

        // Process each day
        for (int day = 1; day <= numDays; day++) {
            int dogFood = scanner.nextInt();
            int catFood = scanner.nextInt();

            totalFoodEaten += (dogFood + catFood);
            dogFoodEaten += dogFood;
            catFoodEaten += catFood;

            if (day % 3 == 0) {
                double cookies = 0.1 * totalFoodEaten;
                totalCookiesEaten += cookies;
            }
        }

        // Calculate percentages
        double percentFoodEaten = (totalFoodEaten / totalFood) * 100;
        double percentDogFood = (dogFoodEaten / totalFoodEaten) * 100;
        double percentCatFood = (catFoodEaten / totalFoodEaten) * 100;

        // Print statistics
        System.out.printf("Total eaten biscuits: %.0f gr.\n", totalCookiesEaten);
        System.out.printf("%.2f%% of the food has been eaten.\n", percentFoodEaten);
        System.out.printf("%.2f%% eaten from the dog.\n", percentDogFood);
        System.out.printf("%.2f%% eaten from the cat.\n", percentCatFood);

    }
}

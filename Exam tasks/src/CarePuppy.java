import java.util.Scanner;

public class CarePuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int foodAmount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int totalFoodEaten = 0;
        String input = scanner.nextLine();

        // Calculate total food eaten
        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);

            totalFoodEaten += foodEaten;
            input = scanner.nextLine();
        }

        // Calculate leftovers or additional food needed
        int leftovers = foodAmount * 1000 - totalFoodEaten;
        int additionalFoodNeeded = Math.abs(leftovers);

        // Print the result
        if (leftovers >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", leftovers);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.%n", additionalFoodNeeded);
        }

    }
}

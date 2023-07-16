import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bayedFood = Integer.parseInt(scanner.nextLine());
        int totalFood = bayedFood * 1000;

        int eatenFood = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            eatenFood += Integer.parseInt(input);
            input = scanner.nextLine();
        }

        int remainingFood = totalFood - eatenFood;

        if (remainingFood >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", remainingFood);
        } else {
            int necessaryFood = Math.abs(remainingFood);
            System.out.printf("Food is not enough. You need %d grams more.%n", necessaryFood);
        }
    }
}
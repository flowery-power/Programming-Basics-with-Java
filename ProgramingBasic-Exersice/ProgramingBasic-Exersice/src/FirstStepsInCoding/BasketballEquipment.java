package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int coachingCost = Integer.parseInt(scanner.nextLine());


        double shoesCost = 0.6 * coachingCost;
        double teamCost = 0.8 * shoesCost;
        double ballCost = teamCost / 4;
        double accessoriesCost = teamCost / 5 ;
        double totalCost = shoesCost + teamCost + ballCost + accessoriesCost;

        // Output result
        System.out.println(totalCost);
    }


}


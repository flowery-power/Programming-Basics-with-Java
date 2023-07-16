package FirstStepsInCoding;

import java.util.Scanner;

public class RoomRepaintCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nylonArea = input.nextInt();
        int paintAmount = input.nextInt();
        int thinnerAmount = input.nextInt();
        int workHours = input.nextInt();

        double nylonCost = nylonArea * 1.5;
        double paintCost = paintAmount * 14.5;
        double thinnerCost = thinnerAmount * 5.0;
        double bagCost = 0.4;
        double totalMaterialCost = nylonCost + paintCost + thinnerCost + bagCost;

        double extraPaintCost = paintAmount * 0.1 * 14.5;
        double extraNylonCost = 2 * 1.5;
        totalMaterialCost += extraPaintCost + extraNylonCost;

        double craftsmenCost = totalMaterialCost * 0.3 * workHours;

        double totalCost = totalMaterialCost + craftsmenCost;

        System.out.println(totalCost);
    }
}

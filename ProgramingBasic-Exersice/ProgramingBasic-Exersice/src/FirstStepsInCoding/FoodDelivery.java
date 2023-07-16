package FirstStepsInCoding;
import java.util.Scanner;


public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;

        double delivery = 2.50;


        int chickenMenCount = Integer.parseInt(scanner.nextLine());
        int fishMenCount = Integer.parseInt(scanner.nextLine());
        int vegaMenCount = Integer.parseInt(scanner.nextLine());


        double chickenCost = chickenMenCount * chickenMenu;
        double fishCost = fishMenCount * fishMenu;
        double vegaCost = vegetarianMenu * vegaMenCount;

        double totalMenuPrice = chickenCost + fishCost + vegaCost;

        double PriceDesert =  totalMenuPrice * 0.2 ;

        double totalSum = PriceDesert + delivery + totalMenuPrice;
        System.out.println(totalSum);

    }
}

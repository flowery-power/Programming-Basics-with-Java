package FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPacket = (int) 5.80;
        int marketPacket = (int) 7.20;
        int cleaningPacket = (int) 1.20;


        int numPen = Integer.parseInt(scanner.nextLine());
        int marketNum = Integer.parseInt(scanner.nextLine());
        int litersForCleaning = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());


        int pricePen = numPen * penPacket;
        int marketPrice = marketNum * marketPacket;
        int ltPrice = litersForCleaning * cleaningPacket;

        int priceAll = pricePen + marketPrice + ltPrice;

        int disc = discount / 100;


        int priceWithDisc = priceAll - (priceAll * disc);

        System.out.println(priceWithDisc);
    }
}

// it's not ready!!!

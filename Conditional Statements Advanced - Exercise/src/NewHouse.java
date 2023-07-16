import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kindFlower = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = Double.parseDouble(scanner.nextLine());
        double change = Double.parseDouble(scanner.nextLine());


        switch (kindFlower) {
            case "Roses":
                total = numFlowers * 5;
                if (numFlowers >= 80) {
                    total *= 0.90;
                }
            case "Dahlias":
                total = numFlowers * 3.80;
                if (numFlowers >= 90) {
                    total *= 85;
                }
                break;
            case "Tulips":
                total = numFlowers * 2.80;
                if (numFlowers >= 80) {
                    total *= 85;
                }
                break;

            case "Narcissus":
                total = numFlowers * 3.00;
                if (numFlowers < 120) {
                    total += 1.15;
                }
                break;

            case "Gladiolus":
                total = numFlowers * 2.50;
                if (numFlowers > 80) {
                    total *= 1.20;
                }
                break;


        }

        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, kindFlower, change);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", change);
        }


    }
}

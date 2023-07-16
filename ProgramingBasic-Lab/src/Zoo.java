import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double oneFoodPackDog = 2.50;
        Double oneFoodPackCat = 4.00;


        int dogCountFood = Integer.parseInt(scanner.nextLine());
        int catCountFood = Integer.parseInt(scanner.nextLine());

        double totalDog = dogCountFood * oneFoodPackDog;
        double totalCat = catCountFood * oneFoodPackCat;

        double totalSum = totalCat + totalDog;

        System.out.println(totalSum + " lv.");
    }
}

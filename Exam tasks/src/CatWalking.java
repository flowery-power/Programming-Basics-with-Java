import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());


        int totalMinutes = minutesPerWalk * countWalks;
        int totalBurnedCalories = totalMinutes * 5;
        double halfCalories = caloriesPerDay * 0.5;



        if (totalBurnedCalories >= halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",totalBurnedCalories );
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",totalBurnedCalories);
        }
    }
}

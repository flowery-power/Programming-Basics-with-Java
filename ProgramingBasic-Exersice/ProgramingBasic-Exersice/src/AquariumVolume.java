import java.util.Scanner;

public class AquariumVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read aquarium dimensions and percentage of capacity occupied
        System.out.print("Enter length in cm: ");
        int length = input.nextInt();

        System.out.print("Enter width in cm: ");
        int width = input.nextInt();

        System.out.print("Enter height in cm: ");
        int height = input.nextInt();

        System.out.print("Enter percentage of capacity occupied: ");
        double occupiedPercentage = input.nextDouble();

        // Calculate aquarium volume in liters
        double volume = length * width * height * 0.001;
        double occupiedVolume = volume * (occupiedPercentage / 100);
        double waterVolume = volume - occupiedVolume;

        // Output result
        System.out.println(waterVolume);
    }
}

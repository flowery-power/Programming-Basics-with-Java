import java.util.Scanner;

public class SpeedInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = scanner.nextDouble();

        if (speed <= 10) {

            System.out.println("Slow");
        } else if (speed <= 50) {
            System.out.println("Average");
        } else if (speed <= 150) {
            System.out.println("Fast");
        } else if (speed <= 1000) {
            System.out.println("Ultra fast");
        } else {
            System.out.println("Extremely fast");
        }
    }
}

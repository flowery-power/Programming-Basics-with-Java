import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMet = Double.parseDouble(scanner.nextLine());
        double distanceSec = Double.parseDouble(scanner.nextLine());


        double climbing = distanceInMet * distanceSec;
        double addTime = (distanceInMet / 50) * 30;



        double totalTime = climbing + addTime;

        double missingTime = totalTime - record;


        if (record > totalTime) {
            System.out.printf(" Yes! The new record is %.02f seconds.", Math.round(totalTime));
        } else {
            System.out.printf("No! He was %.02f seconds slower.", Math.round(missingTime));
        }


    }
}

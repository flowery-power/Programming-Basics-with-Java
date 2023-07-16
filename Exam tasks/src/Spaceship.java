import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double widhtShip = Double.parseDouble(scanner.nextLine());
        double lengtShip = Double.parseDouble(scanner.nextLine());
        double heightShip = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());

        int numAstronauts = 0;

        double volumeRocket = widhtShip * lengtShip * heightShip;
        double volumeRoom = (averageHeight + 0.40) * 2 * 2;

        numAstronauts = (int) (volumeRocket / volumeRoom);


        if (numAstronauts >= 3 && numAstronauts <= 10) {
            System.out.printf("The spacecraft holds %d astronauts.",numAstronauts);
        } else if (numAstronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }

}

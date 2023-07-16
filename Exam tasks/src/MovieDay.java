import java.util.Scanner;
import java. lang. Math;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timePictures = Integer.parseInt(scanner.nextLine());
        int scena = Integer.parseInt(scanner.nextLine());
        int timeScena = Integer.parseInt(scanner.nextLine());

        double podgotovka = timePictures * 0.15;
        double timeZasnemane = scena * timeScena;
        double neobhodimoVreme = podgotovka + timeZasnemane;

        if (neobhodimoVreme <= timePictures) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timePictures - neobhodimoVreme));

        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(neobhodimoVreme -timePictures ));
        }
    }
}
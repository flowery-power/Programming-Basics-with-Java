package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPage = Integer.parseInt(scanner.nextLine());
        int readPages = Integer.parseInt(scanner.nextLine());
        int dayNumbers = Integer.parseInt(scanner.nextLine());

        int timeForReadingOneBook = numPage / readPages;
        int neededHours = timeForReadingOneBook / dayNumbers ;

        System.out.println(neededHours);

    }
        }

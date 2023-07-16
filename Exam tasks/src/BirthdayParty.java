import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double price = Double.parseDouble(scanner.nextLine());

        double cake = 0.20 * price;
        double drnks = cake * 0.55;
        double animator = price / 3;
        double total = cake + drnks+ animator+price;

        System.out.println(total);




    }
}

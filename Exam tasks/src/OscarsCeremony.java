import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceZala = Integer.parseInt(scanner.nextLine());

        double priceStatuetka = priceZala * 0.70;
        double keturing = priceStatuetka * 0.85;
        double sound = keturing *0.50;
        double total = priceZala+priceStatuetka + keturing + sound;
        System.out.printf("%.2f",total);

    }
}

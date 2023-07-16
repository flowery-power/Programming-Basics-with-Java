import java.util.Scanner;

public class Number100and200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        if (num < 100) {
            System.out.printf("Less than 100");

        } else if (num >= 100 && num <= 200) {
            System.out.printf("Between 100 and 200");
        } else if (num > 200) {
            System.out.printf("Greater than 200");

        }

    }
}

import java.util.Scanner;

public class readWords {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

                String name = scanner.nextLine();
                String pass = scanner.nextLine();
                String input = scanner.nextLine();




            while(!input.equals(pass)){
                input = scanner.nextLine();
            }
            System.out.printf("Welcome %s!",name);
        }

    }
}

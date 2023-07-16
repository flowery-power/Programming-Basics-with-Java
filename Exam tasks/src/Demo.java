import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        int minutes = Integer.parseInt(scanner.nextLine());
        int counterWalks = Integer.parseInt(scanner.nextLine());
        int kalories = Integer.parseInt(scanner.nextLine());



        int walk = counterWalks * minutes;
        int totalKalories = walk * 5;
        int eatedkal = (int) (kalories * 0.50);



        if (totalKalories >=eatedkal){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",totalKalories);

        }else if (totalKalories <eatedkal){
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",totalKalories);

        }


        }
    }
}

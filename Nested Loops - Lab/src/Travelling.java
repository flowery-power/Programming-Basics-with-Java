import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        while (!command.equals("End")){
            String destination=command;
            double sum=0;
            double budget=Double.parseDouble(scanner.nextLine());
            while (sum<budget){
                double amount=Double.parseDouble(scanner.nextLine());
                sum+=amount;
            }
            System.out.printf("Going to %s!%n",destination);
            command= scanner.nextLine();
        }
    }
}

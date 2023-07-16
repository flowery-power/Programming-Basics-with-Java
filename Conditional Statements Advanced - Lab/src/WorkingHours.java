import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String dayWeek = scanner.nextLine();

        if (time >= 10 && time <= 18) {
            if (dayWeek.equals("Monday") || dayWeek.equals("Tuesday") || dayWeek.equals("Wednesday") || dayWeek.equals("Thursday")
                    || dayWeek.equals("Friday") || dayWeek.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }else{
            System.out.println("closed");
        }


    }
}

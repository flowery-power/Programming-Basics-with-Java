import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean flag = false;
        for (int i = start; i <= end; i++) {
            for (int y = start; y <= end; y++) {
                int sum = i + y;
                count++;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, y, sum);
                    flag = true;
                    break;
                }

            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}

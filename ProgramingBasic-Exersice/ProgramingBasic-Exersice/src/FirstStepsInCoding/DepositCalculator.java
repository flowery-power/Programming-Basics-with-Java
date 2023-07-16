package FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double  interestRate= Double.parseDouble(scanner.nextLine());


        double deposit = sum * (interestRate / 100);

        double monthsFor = deposit / 12;

        double result = sum + months * monthsFor;
        System.out.println(result);


    }
}

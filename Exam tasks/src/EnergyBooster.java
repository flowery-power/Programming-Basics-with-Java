import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setNumber = scanner.nextLine();
        Integer ordered = Integer.parseInt(scanner.nextLine());

        double price = 0.0;


        switch (fruit) {
            case "Watermelon":
                if (setNumber.equals("small")) {
                     price = 56;
                    break;
                } else if (setNumber.equals("big")) {
                     price = 28.70;
                    break;

                }

            case "Mango":
                if (setNumber.equals("small")) {
                     price = 36.66;
                    break;
                } else if (setNumber.equals("big")) {
                     price = 19.60;
                    break;

                }


            case "Pineapple":
                if (setNumber.equals("small")) {
                    price = 42.10;
                    break;
                } else if (setNumber.equals("big")) {
                     price = 24.80;
                    break;

                }


            case "Raspberry":
                if (setNumber.equals("small")) {
                     price = 20;
                    break;
                } else if (setNumber.equals("big")) {
                     price = 15.50;
                    break;

                }

        }
        double totalPrice = ordered * price;

        if (400 <= totalPrice && totalPrice <= 1000) {
            double discount = totalPrice * 0.85;
            double total = totalPrice - discount;
            System.out.printf("%.2f lv.", total);

        }else {
            System.out.printf("%.2f lv.\n", totalPrice);

        }


    }

}


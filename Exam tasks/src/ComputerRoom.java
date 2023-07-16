import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int numHours = Integer.parseInt(scanner.nextLine());
        int numPeopleGroun = Integer.parseInt(scanner.nextLine());
        String timeDay = scanner.nextLine();

        double cost = 0;
        double total = 0;


        switch (month) {
            case "march":
                if (timeDay.equals("day")) {
                    cost = 10.50;
                } else if (timeDay.equals("night")) {
                    cost = 8.40;
                    break;
                }


            case "april":
                if (timeDay.equals("day")) {
                    cost = 10.50;
                } else if (timeDay.equals("night")) {
                    cost = 8.40;
                    break;
                }

            case "may":
                if (timeDay.equals("day")) {
                    cost = 10.50;
                } else if (timeDay.equals("night")) {
                    cost = 8.40;
                    break;
                }


            case "june":
                if (timeDay.equals("day")) {
                    cost = 12.60;
                } else if (timeDay.equals("night")) {
                    cost = 10.20;
                    break;
                }

            case "july":
                if (timeDay.equals("day")) {
                    cost = 12.60;
                } else if (timeDay.equals("night")) {
                    cost = 10.20;
                    break;
                }

            case "august":
                if (timeDay.equals("day")) {
                    cost = 12.60;
                } else if (timeDay.equals("night")) {
                    cost = 10.20;
                    break;
                }

                total = (cost * numHours) * numPeopleGroun;

                if (numPeopleGroun >= 4) {
                    cost *= 0.90;
                }

                if (numHours >= 5) {
                    cost *= 0.50;
                }
        }


        System.out.printf("Price per person for one hour: %.2f%n", cost);
        System.out.printf("Total cost of the visit: %.2f", total);
    }
}



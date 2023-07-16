import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {
            String name = scanner.nextLine();
            if (name.equals("Facebook")) {
                salary = salary - 150;
            } else if (name.equals("Instagram")) {
                salary = salary - 100;

            } else if (name.equals("Reddit")) {
                salary = salary - 50;

            } else if (salary <= 0) {
                System.out.println("You have lost your salary.");

            }


        }
        {
            System.out.println(salary);


        }


    }
}


//import java.util.Scanner;
//
//public class Salary {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of entries: ");
//        int num = scanner.nextInt();
//        scanner.nextLine(); // Consume the remaining newline character
//
//        System.out.print("Enter the initial salary: ");
//        int salary = scanner.nextInt();
//        scanner.nextLine(); // Consume the remaining newline character
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("Enter the company name: ");
//            String name = scanner.nextLine();
//
//            switch (name) {
//                case "Facebook":
//                    salary -= 150;
//                    break;
//                case "Instagram":
//                    salary -= 100;
//                    break;
//                case "Reddit":
//                    salary -= 50;
//                    break;
//            }
//
//            if (salary <= 0) {
//                System.out.println("You have lost your salary.");
//                break;
//            }
//        }
//
//        System.out.println(salary);
//    }
//}
package FirstStepsInCoding;

import java.util.Scanner;


public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthIncm = Integer.parseInt(scanner.nextLine());
        int widthInCm = Integer.parseInt(scanner.nextLine());
        int heightInCm = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());


        double volumAqua = lengthIncm * widthInCm * heightInCm * 0.001;

        double volumLt= volumAqua / 1000;

        double occupiedSpace = volumLt * (percentage / 100);

        double waterVolume = volumAqua - occupiedSpace;
        System.out.println(waterVolume);



    }

}

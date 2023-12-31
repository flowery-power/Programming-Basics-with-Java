import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        boolean isNominated=false;


        for (int i = 1; i <= juryCount; i++ ){
            String judgeName= scanner.nextLine();
            double judgePoint=Double.parseDouble(scanner.nextLine());
            startingPoints=startingPoints+(judgeName.length()*judgePoint/2);
            if (startingPoints> 1250.50){
                isNominated = true;
                break;
            }
        }
        if (isNominated){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,startingPoints);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.50-startingPoints);

        }


    }
}

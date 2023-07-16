import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneProject = 3;

        String name = scanner.nextLine();
        int numOfProjects = Integer.parseInt(scanner.nextLine());

        int result =  ( oneProject * numOfProjects);

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, result, numOfProjects);
    }
}

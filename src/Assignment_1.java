import javax.xml.namespace.QName;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart City Management System");

//        make choose 1,2,3
        boolean continuing = true;
        do{
            System.out.println("\n1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    continuing = false;
                    System.out.print("Enter the building name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the building Address: ");
                    String description = scanner.nextLine();
                    System.out.print("Number of floors: ");
                    int floors = scanner.nextInt();

                    System.out.println("============================================");
                    System.out.printf("Building name: %s\n", name);
                    System.out.printf("Building Address: %s\n", description);
                    System.out.printf("Building name: %d\n", floors);
                    System.out.println("============================================");

                    System.out.println("Add Building Successful!");
                    break;
                case 2:
                    continuing = false;
                    System.out.println("Coming soon, Stay Close!");
                    break;
                case 3:
                    continuing = false;
                    System.out.println("Exiting Smart City Management System");
                    scanner.close();
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }while(continuing);
    }
}
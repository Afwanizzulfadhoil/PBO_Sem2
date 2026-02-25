import java.util.Scanner;

public class First_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to labit RPG!");

        System.out.printf("Insert Your Name: ");
        String Name = scanner.nextLine();

        System.out.printf("Insert Your age: ");
        int Age = scanner.nextInt();

        if(Age < 13){
            System.out.println("Sorry, you must be at least 13 years old to play this game.");
            scanner.close();
            return;
        }else{
            System.out.printf("Hello %s, age %d! let's start your adventure!", Name, Age);
        }

        System.out.println("Let's make some character!");

        boolean continueCreation = true;
        do {
            System.out.println("Choose your class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");

            System.out.printf("Enter the number of choice: ");
            int classChoice = scanner.nextInt();
            scanner.nextLine();

            switch(classChoice){
                case 1:
                    continueCreation = false;
                    System.out.println("You have chosen the Warrior class! Strong and brave!");
                    break;
                case 2:
                    continueCreation = false;
                    System.out.println("You have chosen the Mage class! Wise and powerful!");
                    break;
                case 3:
                    continueCreation = false;
                    System.out.println("You have chosen the Archer class! Agile and precise!");
                    break;
                default:
                    System.out.println("Invalid choice. Please restart the game and choose a valid class.");
                    break;
            }
        }while(continueCreation);

        System.out.println("Character creation complete! Get ready for your adventure!");
    }
}
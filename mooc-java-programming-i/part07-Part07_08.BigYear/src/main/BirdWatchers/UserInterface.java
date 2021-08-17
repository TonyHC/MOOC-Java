package BirdWatchers;

import java.util.Scanner;

public class UserInterface {
    private BirdList birdsList;
    private Scanner scanner;

    public UserInterface(BirdList birdsList, Scanner scanner) {
        this.birdsList = birdsList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");

            String command = scanner.nextLine();
            if (command.toLowerCase().equals("quit"))
                break;

            birdCommands(command);
        }
    }

    public void birdCommands(String command) {
        switch (command) {
            case "Add Bird":
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birdsList.addABird(new Bird(name,latinName));
                break;
            case "Add Observation":
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                System.out.print("Observation: ");
                String observation = scanner.nextLine();

                if (birdsList.findABird(bird) == null)
                    System.out.println("Not a bird!");
                else
                    birdsList.findABird(bird).addObservation(observation);

                break;
            case "All Birds":
                birdsList.printAllBirds();
                break;
            case "One Bird":
                System.out.print("Bird? ");
                bird = scanner.nextLine();

                if (birdsList.findABird(bird) == null)
                    System.out.println("Not a bird!");
                else
                    birdsList.printASpecificBird(bird);
                break;
            default:
                System.out.print("Invalid Command");
        }

        System.out.println();
    }
}
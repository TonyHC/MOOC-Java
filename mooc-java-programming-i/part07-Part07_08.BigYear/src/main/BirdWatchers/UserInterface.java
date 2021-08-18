package BirdWatchers;

import java.util.Scanner;

public class UserInterface {
    private Bird bird;
    private Scanner scanner;

    public UserInterface(Bird bird, Scanner scanner) {
        this.bird = bird;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");

            String command = sanitizeString(scanner.nextLine());
            if (command.toLowerCase().trim().equals("quit"))
                break;

            birdCommands(command);
        }
    }

    public void birdCommands(String command) {
        String[] options = listOfBirdCommands().split("\n");

        if (command.equals(options[0])) {
            System.out.print("Name: ");
            String birdName = scanner.nextLine();
            System.out.print("Name in Latin: ");
            String latinName = scanner.nextLine();
            bird.addABird(birdName, latinName);
        } else if (command.equals(options[1])) {
            System.out.print("Bird? ");
            String birdName = scanner.nextLine();
            System.out.print("Observation: ");
            String observation = scanner.nextLine();
            bird.addObservation(birdName,observation);
        } else if (command.equals(options[2])) {
            bird.printAllBirdInformation();
        } else if (command.equals(options[3])) {
            System.out.print("Bird? ");
            String birdName = scanner.nextLine();
            bird.printBirdInformation(birdName);
        } else {
            System.out.print("Invalid Command");
        }

        System.out.println();
    }

    public String listOfBirdCommands() {
        return sanitizeString("Add Bird\nAdd Observation\nAll Birds\nOne Bird");
    }

    public String sanitizeString(String text) {
        return text.toLowerCase().trim();
    }
}
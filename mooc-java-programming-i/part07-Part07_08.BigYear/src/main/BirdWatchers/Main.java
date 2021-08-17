package BirdWatchers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BirdList birdsList = new BirdList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(birdsList,scanner);
        ui.start();
    }
}

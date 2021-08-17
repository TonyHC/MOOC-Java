package BirdWatchers;

import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birds;

    public BirdList() {
        this.birds = new ArrayList<>();
    }

    public void addABird(Bird bird) {
        this.birds.add(bird);
    }

    public Bird findABird(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName()))
                return bird;
        }

        return null;
    }

    public void printAllBirds() {
        for (Bird bird : birds)
            System.out.println(bird);
    }

    public void printASpecificBird(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName()))
                System.out.println(bird);
        }
    }
}

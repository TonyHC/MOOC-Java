package BirdWatchers;

import java.util.ArrayList;
import java.util.HashMap;

public class Bird {
    private HashMap<String, String> birds;
    private HashMap<String, ArrayList<String>> observations;

    public Bird() {
        this.birds = new HashMap<>();
        this.observations = new HashMap<>();
    }

    public void addABird(String name, String latinName) {
        birds.putIfAbsent(name, latinName);
    }

    public void addObservation(String name, String message) {
        observations.putIfAbsent(name, new ArrayList<>());
        observations.get(name).add(message);
    }

    public String showObservations(String name) {
        if (!observations.containsKey(name))
            return "";

        StringBuilder listOfObservations = new StringBuilder();
        int observations = this.observations.get(name).size();

        for (int i = 0; i < observations; i++) {
            if (i == observations - 1)
                listOfObservations.append(i+1).append(": ").append(this.observations.get(name).get(i));
            else
                listOfObservations.append(i+1).append(": ").append(this.observations.get(name).get(i)).append("\n");
        }

        return listOfObservations.toString();
    }

    public void printBirdInformation(String name) {
        if (!birds.containsKey(name))
            return;

        System.out.print((observations.get(name) == null) ? name + " (" + birds.get(name)
                + "): 0" + " observations\n" :
                name + " (" + birds.get(name) + "): " + observations.get(name).size() + " observations\n" + showObservations(name) + "\n");
    }

    public void printAllBirdInformation() {
        for (String bird : birds.keySet()) {
            printBirdInformation(bird);
        }
    }
}
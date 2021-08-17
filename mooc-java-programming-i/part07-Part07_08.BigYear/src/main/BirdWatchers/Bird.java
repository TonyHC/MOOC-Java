package BirdWatchers;

import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private ArrayList<String> observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addObservation(String message) {
        observations.add(message);
    }

    public String showObservations() {
        StringBuilder listOfObservations = new StringBuilder();

        for (int i = 0; i < observations.size(); i++) {
            if (i == observations.size() - 1)
                listOfObservations.append(i+1).append(": ").append(observations.get(i));
            else
                listOfObservations.append(i+1).append(": ").append(observations.get(i)).append("\n");
        }

        return listOfObservations.toString();
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations.size() + " observations\n" + showObservations();
    }
}
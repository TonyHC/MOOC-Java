import java.util.ArrayList;

public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game() {}

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }

    public boolean gameWinner(String teamName) {
        if (teamName.equals(homeTeam) && getHomeTeamPoints() > getVisitingTeamPoints())
            return true;

        if (teamName.equals(visitingTeam) && getVisitingTeamPoints() > getHomeTeamPoints())
            return true;

        return false;
    }

    public int gamesPlayed(ArrayList<Game> games, String teamName) {
        int numOfGamesPlayed = 0;

        for (Game game : games) {
            if (teamName.equals(game.getHomeTeam()))
                numOfGamesPlayed++;

            if (teamName.equals(game.getVisitingTeam()))
                numOfGamesPlayed++;
        }

        return numOfGamesPlayed;
    }

    public int gamesWon(ArrayList<Game> games, String teamName) {
        int numOfGamesWon = 0;

        for (Game game : games) {
            if (game.gameWinner(teamName))
                numOfGamesWon++;
        }

        return numOfGamesWon;
    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();
        
        System.out.println("Team:");
        String teamName = scanner.nextLine();
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner scan = new Scanner(Paths.get(file))) {
           while(scan.hasNextLine()) {
               String data = scan.nextLine();
               String[] fileInfo = data.split(",");
               
               String hTeam = fileInfo[0];
               String vTeam = fileInfo[1];
               int hTeamPoints = Integer.valueOf(fileInfo[2]);
               int vTeamPoints = Integer.valueOf(fileInfo[3]);
               
               if(hTeam.equals(teamName) && hTeamPoints > vTeamPoints) {
                   gamesPlayed++;
                   wins++;
               } else if (vTeam.equals(teamName) && vTeamPoints > hTeamPoints) {
                   gamesPlayed++;
                   wins++;
               } else if (hTeam.equals(teamName) && hTeamPoints < vTeamPoints) {
                   gamesPlayed++;
                   losses++;
               } else if (vTeam.equals(teamName) && vTeamPoints < hTeamPoints) {
                   gamesPlayed++;
                   losses++;
               } 
           }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}

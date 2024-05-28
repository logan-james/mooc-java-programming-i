
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String parts[] = line.split(",");

                // PART 1 -- Games Played
                if (parts[0].equals(teamName) || parts[1].equals(teamName)) {
                    gamesPlayed++;
                }
                // String team = parts[0];
                // if (teamName == team) { this is wrong because strings compare .equals not ==
                // gameCount++;
                // }

                // PART 2 -- Wins and Losses
                int firstTeamScore = Integer.valueOf(parts[2]);
                int secondTeamScore = Integer.valueOf(parts[3]);
                if (parts[0].equals(teamName) && firstTeamScore > secondTeamScore) {
                    gamesWon++;
                } else if (parts[0].equals(teamName) && firstTeamScore < secondTeamScore) {
                    gamesLost++;
                } else if (parts[1].equals(teamName) && firstTeamScore > secondTeamScore) {
                    gamesLost++;
                } else if (parts[1].equals(teamName) && firstTeamScore < secondTeamScore) {
                    gamesWon++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
    }

}

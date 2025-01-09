
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            int gameCount = 0;
            int wins = 0;

            while (fileScanner.hasNextLine()) {
                String[] row = fileScanner.nextLine().split(",");
                String homeTeam = row[0];
                String awayTeam = row[1];
                int pointsHomeTeam = Integer.valueOf(row[2]);
                int pointsAwayTeam = Integer.valueOf(row[3]);

                if (homeTeam.equals(teamName)) {
                    gameCount += 1;
                    if (pointsHomeTeam > pointsAwayTeam) {
                        wins += 1;
                    }
                } else if (awayTeam.equals(teamName)) {
                    gameCount += 1;
                    if (pointsAwayTeam > pointsHomeTeam) {
                        wins += 1;
                    }
                }
            }

            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (gameCount - wins));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

// // FROM SOLUTION (USING GAME CLASS) - 2 FILES (Note that exercise does NOT specify that creating a class is required):

// // src/main/java/Game.java
// public class Game {

//     private String hometeam;
//     private String opposingteam;
//     private int homepoints;
//     private int opposingpoints;

//     public Game(String hometeam, String opposingteam, int homepoints, int opposingpoints) {
//         this.hometeam = hometeam;
//         this.opposingteam = opposingteam;
//         this.homepoints = homepoints;
//         this.opposingpoints = opposingpoints;
//     }

//     public String getHomeTeam() {
//         return hometeam;
//     }

//     public String getOpponent() {
//         return opposingteam;
//     }

//     public boolean winnerIs(String team) {
//         if (team.equals(hometeam) && homepoints > opposingpoints) {
//             return true;
//         }

//         if (team.equals(opposingteam) && opposingpoints > homepoints) {
//             return true;
//         }

//         return false;
//     }
// }

// // src/main/java/SportStatistics.java
// import java.nio.file.Paths;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class SportStatistics {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("File: ");
//         String fileName = scan.nextLine();

//         ArrayList<Game> games = readFromFile(fileName);
//         System.out.println("Team: ");
//         String team = scan.nextLine();

//         // Count only the matches of the specified team
//         ArrayList<Game> gamesOfATeam = new ArrayList<>();
//         for (Game game : games) {
//             if (team.equals(game.getHomeTeam()) || team.equals(game.getOpponent())) {
//                 gamesOfATeam.add(game);
//             }
//         }

//         // print the number of games
//         System.out.println("Games: " + gamesOfATeam.size());

//         // count the number of wins
//         int wins = 0;
//         for (Game game : gamesOfATeam) {
//             if (game.winnerIs(team)) {
//                 wins++;
//             }
//         }

//         System.out.println("Wins: " + wins);
//         System.out.println("Losses: " + (gamesOfATeam.size() - wins));
//     }

//     public static ArrayList<Game> readFromFile(String fileName) {
//         ArrayList<Game> games = new ArrayList<>();

//         try (Scanner scan = new Scanner(Paths.get(fileName))) {
//             while (scan.hasNextLine()) {
//                 String line = scan.nextLine();
//                 if (line.isEmpty()) {
//                     continue;
//                 }

//                 String[] parts = line.split(",");

//                 String homeTeam = parts[0];
//                 String opposingTeam = parts[1];

//                 int homePoints = Integer.valueOf(parts[2]);
//                 int opposingPoints = Integer.valueOf(parts[3]);

//                 games.add(new Game(homeTeam, opposingTeam, homePoints, opposingPoints));
//             }
//         } catch (Exception e) {
//             System.out.println("Failed to read from file.");
//         }

//         return games;
//     }
// }

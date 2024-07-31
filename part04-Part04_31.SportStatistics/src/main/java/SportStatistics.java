
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Match> records = readRecordFromFile(file);
        System.out.println("Team: ");
        String team = scan.nextLine();
        int games = countMatchesForTeam(records, team);
        System.out.println("Games: " + games);
        int wins = wins(records, team);
        System.out.println("Wins: " + wins);
        int losses = losses(records, team);
        System.out.println("Losses: " + losses);
        
    }    

    public static ArrayList<Match> readRecordFromFile(String file){
        ArrayList<Match> matches = new ArrayList<>();
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        }catch(Exception e){
            System.out.println("Error: Could not read the file " + file + ".");
        }
        return matches;
        
    }
    public static int countMatchesForTeam(ArrayList<Match> matches, String team){
        int count = 0;
        for(Match match : matches){
            if(match.verificarTime(team)){
                count++;
            }    
        }
        return count;
    }
    public static int wins(ArrayList<Match> matches, String team){
        int wins = 0;
        for(Match match : matches){
            if(match.verificarTime(team)){
                wins += match.wins(team);
            }
        }
        return wins;
    }
    public static int losses(ArrayList<Match> matches, String team){
        int losses = 0;
        for(Match match : matches){
            if(match.verificarTime(team)){
                losses += match.losses(team);
            }
        }
        return losses;
    }
    
}

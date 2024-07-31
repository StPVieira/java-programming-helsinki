
public class Match {
    
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    public boolean verificarTime(String team){
        return team.equals(this.homeTeam) || team.equals(this.visitingTeam);
    }
    public int wins(String team){
        int homeTeamWins = 0;
        int visitingTeamWins = 0;
        if(this.homeTeamPoints > this.visitingTeamPoints){
            homeTeamWins++;
        }else {
            visitingTeamWins++;
        }
        if(this.homeTeam.equals(team)){
            return homeTeamWins;
        }else {
            return visitingTeamWins;
        }
        
        
    }
    public int losses(String team){
        int homeTeamLosses = 0;
        int visitingTeamLosses = 0;
        if(this.homeTeamPoints < this.visitingTeamPoints){
            homeTeamLosses++;
        }else {
            visitingTeamLosses++;
        }
        if(this.homeTeam.equals(team)){
            return homeTeamLosses;
        }else {
            return visitingTeamLosses;
        }
    }
}
import java.util.Scanner;
class bowler{
        Scanner scanner=new Scanner(System.in);
        String name;
        int wickets,matches,balls_bowled,runs_conceded;
    public bowler(){
        System.out.println("Enter the name of the bowler: ");
        this.name= scanner.next();
        System.out.println("Enter the no of wickets: ");
        this.wickets=scanner.nextInt();
        System.out.println("Enter the no of matches: ");
        this.matches=scanner.nextInt();
        System.out.println("Enter the no of balls bowled: ");
        this.balls_bowled = scanner.nextInt();
        System.out.println("Enter the no of runs conceded: ");
        this.runs_conceded=scanner.nextInt();
        if((this.wickets|this.matches|this.balls_bowled|this.runs_conceded)<=0){
            System.out.println("Error");
        }
    } 
    public bowler(String name,int wickets,int matches,int balls_bowled,int runs_conceded){
        this.name=name;
        this.wickets=wickets;
        this.matches=matches;
        this.balls_bowled=balls_bowled;
this.runs_conceded=runs_conceded;
    }
    void computeBowlingAverage(){
        double avg= (double)this.runs_conceded/this.wickets;
        System.out.println("computeBowlingAverage: "+avg);
    }
    void showStatistics(){
        System.out.println("Name: "+this.name);
        System.out.println("wickets: "+this.wickets);
        System.out.println("matches: "+this.matches);
        System.out.println("balls_bowled: "+this.balls_bowled);
        System.out.println("runs_conceded: "+this.runs_conceded);
    }
    void computeStrikeRate(){
        double strike= (double)this.runs_conceded/this.balls_bowled;
        System.out.println("Strike_rate= "+strike);
    }
public static void main(String[] args) {
    bowler bowler=new bowler();
    System.out.println("Name: "+bowler.name);
    bowler.computeBowlingAverage();
    bowler.showStatistics();
    bowler.computeStrikeRate();
}
}
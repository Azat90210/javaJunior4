package lesson17;

public class Main1 {
    public static void main(String[] args) {
        TeamBlue starsie = new TeamBlue();
        TeamBlue starsie1 = new TeamBlue();
        TeamRed mladsie = new TeamRed();
        TeamRed mladsie1 = new TeamRed();
        Game<TeamRed> qwe = new Game<>();
        Game<TeamBlue> ewq = new Game<>();
        qwe.printWinner(mladsie, mladsie1);
        ewq.printWinner(starsie, starsie1);


    }
}

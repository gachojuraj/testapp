package sk.jurij.exercises;

public class RockPaper {
    public static String rps(String p1, String p2){
        if (p1.equals(p2)) return "TIE";
        switch (p1){
            case "rock":
                if (p2.equals("paper")) return "Player 2 wins";
                break;
            case "paper":
                if (p2.equals("scissors")) return "Player 2 wins";
                break;
            case "scissors":
                if (p2.equals("rock")) return "Player 2 wins";
        }
        return "Player 1 wins";
    }
}
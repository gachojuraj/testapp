package sk.jurij.exercises;

public class Rook {
    public static boolean canCapture(String r1, String r2){
        return (r1.charAt(0) == r2.charAt(0) || r1.charAt(1) == r2.charAt(1));
    }
}